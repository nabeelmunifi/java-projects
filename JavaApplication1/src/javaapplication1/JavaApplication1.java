/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author nabee
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = x[0];
        int min = x[0];
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            if (max < x[i]) {
                max = x[i];
            }
            if (x[i] <= min) {
                min = x[i];
            }
            sum += x[i];
        }
        System.out.println("sum is " + sum);
        System.out.println("max is " + max);
        System.out.println("min is " + min);

    }

}
