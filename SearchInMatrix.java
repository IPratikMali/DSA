/* Search an element in sorted matrix
    [ 10 , 23 , 35 , 40]
    [ 12 , 25 , 37 , 41]
    [ 14 , 28 , 39 , 45]

  */
package DSA;

import java.util.Arrays;

public class SearchInMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
                {10 , 23 , 35 , 40},
                {12 , 25 , 37 , 41},
                {14 , 28 , 39 , 45}
        };
        int target = 45;
        System.out.println(Arrays.toString(Search(matrix , target)));
    }

    static int[] Search(int[][] matrix , int target){
        int row = 0;
        int col = (matrix[row].length-1);
        //run loop to check element
        while(row < matrix.length && col >= 0){
            //if target matched then return found
            if (target == matrix[row][col]){
                System.out.println("Found");
                return new int[]{row , col};
            }
            //if target is greater than element then shift to next row (since each row and columns is sorted : ascending order)
            else if (target > matrix[row][col]) {
                row++;
            }
            //if target is smaller than element then shift decrease col
            else {
                col--;
            }
        }
        //return not found if target not matched.
        System.out.println("Not Found");
        return new int[]{-1 , -1};
    }
}

/*
output:

Found
[2, 3]

 */
