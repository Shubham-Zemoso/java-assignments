package com.assignment.javacourse.Section8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Max");
        names.add("Tom");
        names.add("Kevin");
        names.add("John");
        names.add("Bella");
        try{
            PrintWriter pr=new PrintWriter("C:\\Users\\shubh\\IdeaProjects\\Java_Course\\src\\section8\\names.txt");
            for(String i:names){
                System.out.println(i);
                pr.println(i);
            }
            pr.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}

