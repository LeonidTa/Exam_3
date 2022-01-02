package org.campus02.arrays;

import java.util.Arrays;

public class ArrayDemoApp {

    public static void main(String[] args) {

        double[][] matrix = {{3.50, 4.10, 7.80, 9.11, 1.82 }, {5.1, 9.45, 3.12, 3.75, 7.77 , 5.47}, {4.81, 8.45, 4.66, 3.14 }, {7.65, 6.41, 0.97, 2.87, 2.45 }};

        System.out.println("calcRowSum(matrix) = " + Arrays.toString(calcRowSum(matrix)));
        System.out.println("calcAverageValue(matrix) = " + calcAverageValue(matrix));
        System.out.println("findMaxValue(matrix) = " + findMaxValue(matrix));
    }

    public static double[] calcRowSum(double[][] matrix){
        return null;
    }


    public static double findMaxValue(double[][] matrix){
        return 0;
    }

    public static double calcAverageValue(double[][] matrix){
        return 0;
    }
}
