package DSA;

import java.util.Arrays;

public class CyclicSortDemo {
    public static void main(String[] args) {
        int[] arr = {4 ,6 ,3 ,1 ,5 ,2};
        System.out.println(Arrays.toString(Sort(arr)));
    }
    static int[] Sort (int[] arr){
        int i = 0;
        while(i < arr.length){
            // index = value - 1
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}
