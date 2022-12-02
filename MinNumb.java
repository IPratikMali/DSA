package DSA;

public class MinNumb {
    public static void main(String[] args) {
        int[] arr = {12,34,1,-2,3,67,8};
        System.out.println("Minimum number is " + Min(arr));
    }
    static int Min(int[] arr){

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
