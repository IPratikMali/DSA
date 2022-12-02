package DSA;

public class _2DarraySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 23, 54, 65},
                {90, 34, 21},
                {89, 31}
        };
        int target = 31;
        System.out.println(Search(arr , target));
    }
    static String Search(int[][] arr , int target){
        if(arr.length == 0){
            return "size error";
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return "Found";
                }
            }
        }
        return "not found";
    }
}
