/**Given an odd number n, not exceeding 15. Create a two-dimensional array (matrix) from n×n elements,
 by filling it with "." symbols (each element of the matrix is a string containing a single symbol).
  Then fill the middle row of the matrix, the middle column, and the main and the secondary
   diagonals with the "*" symbols. As a result, all "*"s in the array must form the star figure.
   Output this matrix; elements of the array should be space separated.*/

import java.util.Arrays;
import java.util.Scanner;

public class StarFigure {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int mid=n/2;
        String[][] matrix = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ".";
            }
        }
        
        for (int i = 0; i <n ; i++) {
            matrix[i][mid]="*";
            matrix[mid][i] = "*";
            if (i<mid){
                matrix[i][i] = "*";
                matrix[i][n - i - 1] = "*";
            }
            if (i>mid){
                matrix[i][n - i - 1] = "*";
                matrix[i][i] = "*";
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==n-1) System.out.print(matrix[i][j]);
                else System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");

        }

    }
}
