/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *Insurance Estimator
 * @author msteph22
 * 
 */
public class Insurance_EstimatorTest {
    
    public Insurance_EstimatorTest() {
    }

    @Test
    public void testCalculateTotal() {
        System.out.println("calculateTotal");
        double age = 20.0;
        String expResult = "$400.00";
        String result = Insurance_Estimator.calculateTotal(age);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalculateTotalNegativeValue() {
        System.out.println("calculateTotal");
        double age = -20.0;
        String expResult = "null";
        String result = Insurance_Estimator.calculateTotal(age);
        assertEquals(expResult, result);
    }
}
