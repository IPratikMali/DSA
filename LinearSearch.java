package DSA;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 43, 23, 17};
        int target = 63;
        System.out.println(Search(arr , target));
    }

   static int Search(int[] a, int target) {
        //if array size is 0 print -1
        if (a.length == 0) {
            return Integer.MAX_VALUE;
        }
        //checking each element from starting
        for (int index = 0; index < a.length; index++) {
            if (a[index] == target) {
                //if you want to return an element itself
                return a[index];
                //if you want to return an index of an element
                //return index;
            }
        }
        //random number if element not found
        return Integer.MAX_VALUE;
    }

}
