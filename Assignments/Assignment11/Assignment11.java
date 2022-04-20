package JavaAssignments.Assignment11;

import java.io.*;
import java.util.*;
public class Assignment11 {
    private HashMap<Character,Integer> wordsFreq;
    FileReader filereader;
    FileWriter filewriter;
    Assignment11()
    {
        wordsFreq=new HashMap<Character,Integer>();
    }
    public void getFequency(String filepath)  {
        try
        {
            File file=new File(filepath);
            filereader = new FileReader(file);

            int content;
            while ((content = filereader.read()) != -1)
            {
                char currChar=(char) content;
                if(wordsFreq.containsKey(currChar))
                {
                    int freq=wordsFreq.get(currChar);
                    wordsFreq.put(currChar,freq+1);
                }
                else
                {
                    wordsFreq.put(currChar,1);
                }
            }
            filereader.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    public void savingResultsIntoFile(String filepath){
        try {
            filewriter = new FileWriter(filepath);
            for (char character : wordsFreq.keySet()) {
                filewriter.write("\n" + character + "\t" + wordsFreq.get(character));
            }
            filewriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    public void readResultFromFile(String filepath) {
        try {
            filereader = new FileReader(filepath);
            int content;
            while ((content = filereader.read()) != -1) {
                System.out.print((char) content);
            }
            filereader.close();
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }
    }
    public static void main(String args[]) throws IOException {
        Assignment11 object=new Assignment11();
        //args[0]->Inputfile
        //args[1]->File to save the result
        object.getFequency(args[0]);
        object.savingResultsIntoFile(args[1]);
        object.readResultFromFile(args[1]);
    }
}
//"C:\\Users\\shubh\\IdeaProjects\\Java_Assignments\\src\\JavaAssignments\\Assignment11\\frequency.txt"