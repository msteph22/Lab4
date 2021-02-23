
import java.text.NumberFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Insurance Estimator
 * @author msteph22
 * 
 */
public class Main {
    public static void main(String[] args) {
    //Life insurance cost per year
    Scanner keyboard = new Scanner(System.in);

    //Input age
    System.out.println("Enter your age:");
    double age = keyboard.nextDouble();
    
    //Send to calculate method and display
    String totaldol = calculateTotal(age);
    
    //Display total
    System.out.println("Your life insurance policy will be " + totaldol + "/year.");
    }
    public static String calculateTotal(double age){
        if (age < 0 ){
            return "null";
        }
        //Calculations(5x customers age + 300 = $XXX/year)
        double total = (5 * age) + 300;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String totaldol = formatter.format(total);
        return totaldol;
    }
}
