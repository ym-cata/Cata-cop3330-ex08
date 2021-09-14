/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int people, pizzas, slices, total, quotient,remainder;
    Scanner sc=new Scanner(System.in);

    System.out.print("How many people? ");
    people=sc.nextInt(); //asks user to input how many people there are

    System.out.print("How many pizzas do you have? ");
    pizzas=sc.nextInt(); //asks user to input how many pizzas they have

    System.out.print("How many slices of pizza? ");
    slices=sc.nextInt(); //asks user to input how many slices of pizza there are

    total=pizzas*slices; //calculates the total of people and slices

    System.out.println(" "+people+" people with "+pizzas+" pizzas ("+total+" slices)");
    quotient=total/people; //divides to determine how many slices the people get

    System.out.println("Each person gets "+quotient+" slices of pizza");
    remainder=total%people;

    System.out.println("There are "+remainder+" leftover slices"); // prints how many slices are leftover
  }
}