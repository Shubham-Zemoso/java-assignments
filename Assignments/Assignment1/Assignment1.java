package JavaAssignments.Assignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MatchedFiles {
    public static void printMatchedFiles(File homeDirectory, String regex) {

        Pattern pattern=Pattern.compile(regex);
        File fileList[] = homeDirectory.listFiles();
        for (int i = 0; i < fileList.length; i++) {

            // Checking subdirectories
            if(fileList[i].isDirectory())
            {
                printMatchedFiles(fileList[i],regex);
            }

            Matcher match= pattern.matcher(fileList[i].getName());

            if (match.find() && fileList[i].isFile()) {
                System.out.println(fileList[i].getAbsolutePath());
            }
        }
    }
}

public class Assignment1 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String regex;
        File homeDirectory = new File("C:\\Users\\shubh\\IdeaProjects\\Java_Assignments");
        while(true)
        {
            System.out.println("Enter Pattern(Enter -1 to exit): ");
            regex = sc.next();
            if(regex.equals("-1"))
            {
                break;
            }
            MatchedFiles.printMatchedFiles(homeDirectory,regex);

        }

    }
}
