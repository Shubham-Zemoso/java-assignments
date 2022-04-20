package section2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Proj2_2_MadLibs_Clone {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String adj1, gName, adj2, occup, occup2, place, cloth, hobby, adj3, bName, mName;

        System.out.println("Enter an adjective: ");
        adj1 = sc.next();
        System.out.println("Enter a girl's name: ");
        gName = sc.next();
        System.out.println("Enter another adjective: ");
        adj2 = sc.next();
        System.out.println("Enter an Occupation: ");
        occup = sc.next();
        System.out.println("Enter the name of a place: ");
        place = sc.next();
        System.out.println("Enter the name of a piece of clothing: ");
        cloth= sc.next();
        System.out.println("Enter the name of a hobby: ");
        hobby = sc.next();
        System.out.println("Enter another adjective");
        adj3 = sc.next();
        System.out.println("Enter another occupation");
        occup2 = sc.next();
        System.out.println("Enter a boy's name");
        bName = sc.next();
        System.out.println("Enter a man's name");
        mName = sc.next();

        System.out.println("There once was a " + adj1 + " girl named " +gName+ " who was a " +adj2+ " in the Kingdom of " +place+ ". She loved to wear " +cloth+ " and to " +hobby+ ". She wanted to marry the " +adj3+ " named " +bName+ " but her father, King "+mName+ " forbid her from seeing him.");

    }


}
