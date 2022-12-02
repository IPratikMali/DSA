package DSA;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,34 ,7,8,9,13,15};
        int target = 4;
        int m = 1 , n = 6;
        System.out.println(Search(arr , target , m , n));
    }
    static String Search(int[] arr , int target , int m , int n){
        if(arr.length == 0){
            return "size error";
        }
        for (int i = m ; i < n ; i++) {
            if(target == arr[i]){
                return "Found";
            }
        }
        return "not found";
    }
}
