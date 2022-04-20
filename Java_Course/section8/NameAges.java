package section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NameAges {
    public static void main(String[] args) {
        Scanner names,ages;
        String name,age;
        try{
            PrintWriter pr=new PrintWriter("C:\\Users\\shubh\\IdeaProjects\\Java_Course\\src\\section8\\nameages.txt");
            names=new Scanner(new File("C:\\Users\\shubh\\IdeaProjects\\Java_Course\\src\\section8\\names.txt"));
            ages=new Scanner(new File("C:\\Users\\shubh\\IdeaProjects\\Java_Course\\src\\section8\\ages.txt"));
            while(names.hasNext() && ages.hasNext()){
                name=names.next();
                age=ages.next();
                pr.println(name +" is "+age +" years old");
            }
            pr.close();
            names.close();
            ages.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
