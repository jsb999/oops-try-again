package org.example;

import java.util.Scanner;

public class Inputer{
  public int getInput(int lowBound, int highBound, String inputPrompt, String errorPrompt){
    boolean validInput = false;
    int userValue = 0;


    while(!validInput){
      Scanner userInput = new Scanner(System.in);//scanner for the user inputs
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