package JavaAssignments.Assignment2;

import java.util.Scanner;

class ContainAlphabets {
    public static boolean isStringContainsAllAlphabets(String string)
    {
        if(string.length()<26)
            return false;
        String upperPhrase=string.toLowerCase();
        String alphabets="abcdefghijklmnopqrstuvwxyz";

        for(int index=0;index<alphabets.length();index+=1)
        {
            char currChar=alphabets.charAt(index);
            if(upperPhrase.indexOf(currChar)!=-1)
                continue;
            else
                return false;
        }
        return true;
    }
}

class Tester {
    public static void tester(String phrase)
    {

        if(ContainAlphabets.isStringContainsAllAlphabets(phrase))
            System.out.println("String contains a-z alphabets");
        else
            System.out.println("String do not contain a-z alphabets");
    }
}

public class  Assignment2 {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String string =sc.nextLine();
        Tester.tester(string);
    }
}
//Time complexity is O(n)
//Space Complexity is O(1)