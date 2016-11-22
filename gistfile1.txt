/*CSCI 1100 - Lab 8 - Question 5
      
                    <Sally Keating> <B00739692> <11/22/16> */

public class Q5{
   public static void main (String [] args){
   
      oddNumbers();
   
   }
   public static void oddNumbers(){
   
      for (int i = 1; i <= 50; i++){
         if (i % 2 != 0) {
            System.out.print(i + " ");
         }
      }
   }  
}