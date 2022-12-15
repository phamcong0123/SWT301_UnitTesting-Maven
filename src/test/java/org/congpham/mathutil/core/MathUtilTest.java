/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.congpham.mathutil.core;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Admin
 */
public class MathUtilTest {

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(2, MathUtil.getFactorial(2));
        assertEquals(120, MathUtil.getFactorial(5));
    }

    @Test
    public void testFactorialGivenWrongArgumentReturnsException() {
        assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-1));
        assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(21));
    }

    @ParameterizedTest(name = "#{index} - Test with n = {0}, expected {1}")
    @DisplayName("Parameterized test")
    @MethodSource("initData")
//    @CsvSource({
//        "0, 1",
//        "1, 1",
//        "2, 2",
//        "3, 6",
//        "4, 24",
//        "5, 120",
//        "6, 720"
//    })

    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        assertEquals(expected, MathUtil.getFactorial(n));
    }

    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 721}
        };
    }

}
