/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */


package org.example;
import java.util.Calendar;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.print("What is your current age? ");
        String ageStr = scanner.nextLine();
        boolean input = false;
        int age = 0;
        while(!input) {
            if (isNum(ageStr)) {
                age = Integer.parseInt(ageStr);
                input = true;
            } else {
                System.out.print("Error! Please insert DIGITS ONLY:");
                ageStr = scanner.nextLine();
            }
        }
        System.out.print("At what age would you like to retire? ");
        String retireStr = scanner.nextLine();
        input = false;
        int retire = 0;
        while(!input) {
            if (isNum(retireStr)) {
                retire = Integer.parseInt(retireStr);
                input = true;
            } else {
                System.out.print("Error! Please insert DIGITS ONLY: ");
                retireStr = scanner.nextLine();
            }
        }

        int YearsTillRetirement = retire - age;
        if(YearsTillRetirement < 0) {
            System.out.println("You could have retired " + Math.abs(YearsTillRetirement) + " years ago! \n" +
                    "It is " + year + " so you could have retired in " + (year + YearsTillRetirement)+".");
        }
        else if(YearsTillRetirement == 0) {
            System.out.println("You are able to retire now, Congrats!");
        }
        else {
            System.out.println("You have " + YearsTillRetirement + " years until you can retire. \n" +
                    "It is " + year + ", so you can retire in " + (year + YearsTillRetirement)+".");
        }

    }

    private static boolean isNum(String input) {
        boolean isNum = true;
        try {
            Integer.parseInt(input);
        }
        catch(NumberFormatException e) {
            isNum = false;
        }
        return isNum;
    }
}
