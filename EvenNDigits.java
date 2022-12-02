package DSA;

public class EvenNDigits {
    public static void main(String[] args) {
        int[] arr = {12 ,345 ,2 ,1234};
        System.out.println("Number of Elements having Even digits are :" + Even(arr));
    }
    static int Even(int[] arr){
        int count1 = 0;
        int count2 = 0;
        int temp = 0;
        //index from starting
        for (int i = 0; i < arr.length; i++) {
            // counting the number of digits of an element
            for (int j = 0; arr[i] > 0 ; j++) {
                temp = arr[i] % 10;
                arr[i] = arr[i]/10;
                count1++;
            }
            // checking if digit number is even or not
            if(count1 % 2 == 0){
                count2++;
            }
            //reinitializing count1 as 0
            count1 = 0;
        }
        //returning count of elements having even digits
        return count2;
    }
}
