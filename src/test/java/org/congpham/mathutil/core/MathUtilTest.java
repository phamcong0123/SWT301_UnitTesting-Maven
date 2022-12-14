/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.congpham.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class MathUtilTest {  
    @Test   
    public void testFactorialGivenRightArgumentReturnsWell(){
        assertEquals(2, MathUtil.getFactorial(2));
        assertEquals(120, MathUtil.getFactorial(5));  
    }
    @Test
    public void testFactorialGivenWrongArgumentReturnsException(){
        assertThrows(IllegalArgumentException.class, ()-> MathUtil.getFactorial(-1));
        assertThrows(IllegalArgumentException.class, ()-> MathUtil.getFactorial(21));
    }
}
