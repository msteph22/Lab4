/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author stephensmac
 */
public class Bank_ChargesTest {
    
    public Bank_ChargesTest() {
    }

    @Test
    public void testDecideRate0() {
        System.out.println("decideRate");
        int numOfChecks = 0;
        double expResult = 10.0;
        double result = Bank_Charges.decideRate(numOfChecks);
        assertEquals(expResult, result, 0.0);
    }
    public void testDecideRate20() {
        System.out.println("decideRate");
        int numOfChecks = 20;
        double expResult = 11.60;
        double result = Bank_Charges.decideRate(numOfChecks);
        assertEquals(expResult, result, 0.0);
    }
    public void testDecideRate40() {
        System.out.println("decideRate");
        int numOfChecks = 40;
        double expResult = 12.40;
        double result = Bank_Charges.decideRate(numOfChecks);
        assertEquals(expResult, result, 0.0);
    }
    public void testDecideRate60() {
        System.out.println("decideRate");
        int numOfChecks = 60;
        double expResult = 12.40;
        double result = Bank_Charges.decideRate(numOfChecks);
        assertEquals(expResult, result, 0.0);
    }
    public void testDecideRateNegative() {
        System.out.println("decideRate");
        int numOfChecks = -10;
        double expResult = 10.0;
        double result = Bank_Charges.decideRate(numOfChecks);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testFormatTotal() {
        System.out.println("formatTotal");
        double total = 20.0;
        String expResult = "$20.00";
        String result = Bank_Charges.formatTotal(total);
        assertEquals(expResult, result);
    }
    
}
