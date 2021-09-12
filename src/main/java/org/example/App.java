package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App
{
    public static void main(String[] args){

        //Initialize age variable
        int Age;

        //Start Scanner
        Scanner input = new Scanner(System.in);

        //Asks what the age is
        System.out.print("What is your age? ");
        Age = Integer.parseInt(input.nextLine());

        String Check = (Age >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.");

        System.out.println(Check);
    }
}
