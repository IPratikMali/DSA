package DSA;

import java.util.Arrays;

public class InsertionDemo {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        System.out.println(Arrays.toString(Sort(arr)));
    }
    static int[] Sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] > arr[j-1]){
                    break;
                }
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        return arr;
    }
}
