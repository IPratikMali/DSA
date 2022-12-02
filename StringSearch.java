package DSA;

import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String  s = "PratikMali";
        char target = 'j';
        System.out.println(Search(s , target));
    }

    static String Search(String s , char target){
        if (s.length() ==0){
            return "size error";
        }
        for (int i = 0; i < s.length() ; i++) {
            if(target == s.charAt(i)){
                return "found";
            }
        }
        return "not found";
    }
}
