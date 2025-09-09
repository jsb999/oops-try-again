package org.example;

import java.util.Scanner;

public class App {
  private Scanner userInput = new Scanner(System.in);//scanner for the user inputs
  
  public static void main(String[] args) {
int userValue = getInput(1, 100, "Please enter a number between 1 and 100:", "that was not a valid input, try again,");//first initial call of get input 
    System.out.println("You have inputed: " + userValue);//outputs the inputed value if it is correct

    userValue = getInput(1, 12, "Please enter a number between 1 and 12:", "that was not a valid input, try again,"); //second call of get input
    System.out.println("You have inputed: " + userValue); //outputs the inputed value if it is correct
  }

  public int getInput(int lowBound, int highBound, String inputPrompt, String errorPrompt){
    boolean validInput = false;
    int userValue = 0;


    while(!validInput){
      System.out.println(inputPrompt);

      if(!userInput.hasNextInt()){ //checks if the input is an integer
        validInput = false;
        System.out.println(errorPrompt);
        userInput.next();
      } else{
        userValue = userInput.nextInt();
        if(userValue < lowBound || userValue > highBound){//checks if the input is within the bounds
          validInput = false;
          System.out.println(errorPrompt);
        } else{
          validInput = true;
        }
      }
    }

    return userValue; //returns the inputed value if it is correct
  }
}