/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.congpham.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtil {
    //ko co giai thua so am
    //0! = 1
    //21! > max cua long
    public static long getFactorial(int n){
        if (n < 0 || n > 20) throw new IllegalArgumentException();
        if (n < 2) return 1;
        long result = 1;
        for (int i = n; i > 1; i--) result = result*i;     
        return result;
    }
}
