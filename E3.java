/*CSCI 1100 - Lab 4 - Exercise 3
      This program will calculate the price of a pizza based on how many pizzas 
      are being ordered.
              <Sally Keating> <B00739692> <10/10/16> */

import java.util.Scanner;
public class E3{
   public static void main (String [] args){
      Scanner keyboard = new Scanner (System.in);
      
      double amount, price;
      
      /*This takes the user's input of how many pizzas are being ordered and 
      saves it to the variable amount */
      System.out.print("Enter the number of pizzas: ");
      amount = keyboard.nextDouble();
      
      /*this if statement asseses if the amount of pizzas ordered is greater than 3, and 
      then calculates the price based on flat rate per pizza*/
      if (amount >= 3){
         price = (amount * 9.99);
         System.out.print("Your total cost: $" + price);
      }
      
      else{
         price = (amount * 12.99);
         System.out.print("Your total cost: $" + price);
      }
   }
}