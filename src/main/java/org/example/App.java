package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner s = new Scanner(System.in);

        String password = new String("abc$123"), input;

        System.out.print("What is the password? ");

        input = s.nextLine();

        if(input.equals(password)){

            System.out.print("Welcome!");

        }

        else{

            System.out.print("I don't know you.");

        }

        s.close();

    }

}
