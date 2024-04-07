/*
Programmer: Moosa
Date: 4th April 2024
Description: Mini Assignment
 */
package sweatershoppingassignment;

import java.util.Scanner;

public class SweaterShoppingAssignment 
{

    public static void main(String[] args) 
    {
        Scanner scanS = new Scanner(System.in);
        Scanner scanN = new Scanner(System.in);
        
        System.out.println("\n\n\t ********************************");
        System.out.println("\t *                              *");
        System.out.println("\t *        M.J & CLOTHING        *");
        System.out.println("\t *                              *");
        System.out.println("\t ********************************");
        
        String blue;
        String black;
        String red;
        String brown;
        String white;
        
        System.out.println("Welcome to M.J Clothing!");
        System.out.println("Please pick a color from the following: Blue,"
                + " Black, Red, Brown, and White.");
        String color = scanS.nextLine();
        
        System.out.println("Please enter the current amount of cash you have.");
        
        double cash = scanN.nextDouble();
        int sweaterPrice = 40;
        double cashA = cash - 40;
        
        if(color.equalsIgnoreCase("Black") || color.equalsIgnoreCase("White"))
        {
            System.out.println("You have enough sweaters in this color!");
        } else if(color.equalsIgnoreCase("Red") || color.equalsIgnoreCase("Brown")) {
            System.out.println("Sorry, we are out of that color.");
        } else if(color.equalsIgnoreCase("Blue")){
            if(cash >= 40 && cashA < 40){
                System.out.println("How about a pair of jeans to go with that sweater?");
            } else {
            System.out.println("Sorry, you do not have enough cash avaiable for this purchase.");
        }   
        } else {
                System.out.println("Your color choice is invalid.");
                }
        
        
    }
   
}
