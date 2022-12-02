/*
find the ceiling of the number in an array.
ceiling (smallest number that is equal or greater than the target element )
 */
package DSA;

public class CeilingNumb {
    public static void main(String[] args) {
        int[] arr = {1 , 4 , 5 , 7 , 9 , 12 , 14};
        int target = 10;
        System.out.println(Search(arr , target));
    }
    //applying binary search since it is sorted array.
    static int Search(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        //if while condition gets violeted , the number should be at start position.
        return start;
    }
}
