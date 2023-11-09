package com.octillion;

public class RotatedMatrix {
    public static void main(String[] args) {
        int[][] originalMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] rotatedMatrix = rotateMatrixBy90Clockwise(originalMatrix);
        for (int i=0; i<rotatedMatrix.length; i++){
            for (int j=0; j<rotatedMatrix[0].length; j++){
                System.out.print(rotatedMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

         public static int[][] rotateMatrixBy90Clockwise(int[][] matrix) {
            int row = matrix.length; //3
            int col = matrix[0].length; //3
            int[][] rotatedMatrix = new int[col][row];

            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    rotatedMatrix[j][row-1-i] = matrix[i][j];
                }
            }
//(0,2),(0,1),(0,0)
    return rotatedMatrix;

        }
}
