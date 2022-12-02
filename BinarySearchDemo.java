package DSA;

public class BinarySearchDemo {
    // Ascending order
     public static void main(String[] args) {
        int[] arr = {1 ,4, 7, 9, 13, 14, 21, 76};
        int target = 13;
        System.out.println(Search(arr , target));
    }
    static int Search(int[] arr , int target){
            int start = 0;
            int end  = arr.length-1;

            while( start <= end){
                //finding middle value
                int mid = start + (end - start)/2;
                if (target > arr[mid]){
                    start = mid + 1;
                }
                else if (target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    return mid;
                }
            }
            return -1;

    }

    //Descending Order
    /* public static void main(String[] args) {
        int[] arr = {90 , 78 , 65 , 56 , 43, 32, 21, 14, 7 ,1};
        int target = 56;
        System.out.println(Search(arr , target));
    }
    static int Search(int[] arr , int target){
            int start = 0;
            int end  = arr.length-1;

            while( start <= end){
                //finding middle value
                int mid = start + (end - start)/2;
                if (target < arr[mid]){
                    start = mid + 1;
                }
                else if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    return mid;
                }
            }
            return -1;

  } */
}
