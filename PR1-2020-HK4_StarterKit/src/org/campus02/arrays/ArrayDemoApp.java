package org.campus02.arrays;

import java.util.Arrays;

public class ArrayDemoApp {

    public static void main(String[] args) {

        double[][] matrix = {{3.50, 4.10, 7.80, 9.11, 1.82}, {5.1, 9.45, 3.12, 3.75, 7.77 , 5.47}, {4.81, 8.45, 4.66, 3.14 }, {7.65, 6.41, 0.97, 2.87, 2.45 }};


        System.out.println("calcRowSum(matrix) = " + Arrays.toString(calcRowSum(matrix)));
        System.out.println("calcAverageValue(matrix) = " + calcAverageValue(matrix));
        System.out.println("findMaxValue(matrix) = " + findMaxValue(matrix));
    }

    public static double[] calcRowSum(double[][] matrix){
        double sumArray [] = new double[matrix.length];
        double sumNumbers;

        for (int i = 0; i < matrix.length; i++) {

            sumNumbers = 0;
            for (int j = 0; j < matrix[i].length; j++){
                sumNumbers += matrix[i][j];
            }

            sumArray[i] = sumNumbers;
        }

        return sumArray;
    }


    public static double findMaxValue(double[][] matrix) {
        double highestNumber = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] > highestNumber) {
                    highestNumber = matrix[i][j];
                }
            }
        }
        return highestNumber;
    }

    public static double calcAverageValue(double[][] matrix) {
        double avg = 0;
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
               avg += matrix[i][j];
               count++;
            }
        }
        return avg / count;
    }
}

