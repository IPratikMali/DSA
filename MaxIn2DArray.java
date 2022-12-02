package DSA;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 23, 54, 65},
                {99, 34, 21},
                {89, 31}
        };
        System.out.println("maximum element is "+ Max(arr));
    }
    static int Max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
