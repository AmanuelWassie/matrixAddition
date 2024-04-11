package com.Craft.Wassie;

public class MatrixAddition {
        public static void main(String[] args) {
            int[][] test1 = {{3, 5}, {4,9}};
            int[][] test2= {{9, 8 }, {6, 5}};
            int[][] result = addMatrices(test1,test2);

            //  the result matrix
            System.out.println("Result Matrix:");
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] + ":");

                }
                System.out.println();
            }
        }
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }

    }


