package section8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {
    public static void main(String[] args) {
        PrintWriter outFile;
        try{
            outFile=new PrintWriter("C:\\Users\\shubh\\IdeaProjects\\Java_Course\\src\\section8\\output.txt");
            outFile.println("hello");
            outFile.println("welcome");
            outFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
    }
}
