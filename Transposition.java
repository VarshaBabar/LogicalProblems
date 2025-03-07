// 13. This week's exercise is to write a function that performs a matrix transposition. Matrix 
// transposition means swapping the rows and columns of a matrix.

import java.util.Arrays;

public class Transposition {
    public static int[][] trans(int matrix[][]){
        int transMatrix[][] = new int[matrix[0].length][matrix.length];
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length;j++){
                transMatrix[j][i] = matrix[i][j];
            }
        }
        return transMatrix;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                        {4,5,6}};
                        
        int transMatrix[][] = trans(matrix);

        for(int row[] :  transMatrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
