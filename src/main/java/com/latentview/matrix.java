package com.latentview;

public class matrix {
    /*
    [1,2,5
3,8,9
4,8,7]
[ 7,8,4
9,8,3
5,2,1]
     */
    public static void main(String[] args) {
        int[][] originalMatrix = {
                {1,2,5},
                {3,8,9},
                {4,8,7}
        };
        int[][] reversedMatrix = reverseMatrix(originalMatrix);
//        System.out.println(reversedMatrix);
        for(int[] row:reversedMatrix){
            for(int element : row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }

    public static int[][] reverseMatrix(int[][] matrix){
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[][] reversed = new int[numRows][numCols];

        for(int i=0; i<numRows; i++){
            for(int j=0; j<numCols; j++){
                reversed[i][j] = matrix[numRows-1-i][numCols-1-j];
            }
        }
        return reversed;
    }
}
