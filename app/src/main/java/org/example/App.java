package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Inputer inputer = new Inputer();
int userValue = inputer.getInput(1, 100, "Please enter a number between 1 and 100:", "that was not a valid input, try again,");//first initial call of get input 
    System.out.println("You have inputed: " + userValue);//outputs the inputed value if it is correct

    userValue = inputer.getInput(1, 12, "Please enter a number between 1 and 12:", "that was not a valid input, try again,"); //second call of get input
    System.out.println("You have inputed: " + userValue); //outputs the inputed value if it is correct
  }
}