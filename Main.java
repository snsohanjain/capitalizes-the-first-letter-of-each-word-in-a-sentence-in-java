package com.codewithsohan;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


        //Split sentence into words

        String words[]=str.split("\\s");
        String newString ="";

        for(String w: words){
            String first = w.substring(0,1);      //First Letter
            String rest = w.substring(1);         //Rest of the letters

            //Concatenete and reassign after
            //converting the first letter to uppercase
            newString+=first.toUpperCase()+ rest+ " ";
        }

        //trim to remove the last redundant blank space
        System.out.println(newString.trim());
    }
}