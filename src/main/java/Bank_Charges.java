
import java.text.NumberFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephensmac
 */
public class Bank_Charges {
    public static void main(String[] args) {
        //Setup Scanner 
        Scanner keyboard = new Scanner(System.in);

        //Ask for number of checks
        System.out.println("Enter the number of checks written this month:");
        int numOfChecks = keyboard.nextInt();
        
        double total = decideRate(numOfChecks); //get return from decideRate
        String totalDol = formatTotal(total);//sends total (double) to be formatted for dollars
        
        //Display
        System.out.println("Bank Service Fee: " + totalDol);
        
    }
    //Method that decides rate and returns amount (Unformatted)
    public static double decideRate(int numOfChecks){
        double total = 0;
        //If StatementsR
        if ((numOfChecks >= 0) && (numOfChecks <= 19)){
           total = (0.10 * numOfChecks) + 10;
        } else if((numOfChecks >= 20) && (numOfChecks <= 39)){
           total = (0.08 * numOfChecks) + 10;
        } else if((numOfChecks >= 40) && (numOfChecks <= 59)){
           total = (0.06 * numOfChecks) + 10;
        } else if(numOfChecks >= 60){
           total = (0.04 * numOfChecks) + 10;
        } else{
            System.out.println("Please Enter a valid number.");
            total = 10; 
        }
        return total;
    }
    //Method that formats double into dollars
    public static String formatTotal(double total){
        //Format into dollars
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String totalDol = formatter.format(total);
        return totalDol;
    }
}
