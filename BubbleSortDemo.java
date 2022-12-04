package DSA;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {3,1,5,2,4};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <arr.length-i ; j++) {
                if(arr[j] < arr[j-1]){
                    /*
                      a = a+b
                      b = a-b
                      a = a-b

                      to swap numbers;
                     */
                    arr[j-1] = arr[j-1] + arr[j];
                    arr[j] = arr[j-1] - arr[j];
                    arr[j-1] = arr[j-1] - arr[j];
                    swapped = true;
                }
            }
            if(!swapped){
                // if not swapped means it is sorted array so break the loop.
                break;
            }
        }
        return arr;
    }
}

