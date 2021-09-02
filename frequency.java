package exercise;

import java.util.*;

public class frequency {

    static boolean Anagrams(String A, String B) {
    if (A.length() != B.length()) {
         return false;
    }
    else{
         int[] arr = new int[256];
         for (int i = 0; i < 256; i++) {
             for (int j = 0; j < A.length(); j++) {
                 if (i == (int) A.charAt(j))
                     arr[i]++;
                 if (i == (int) B.charAt(j))
                     arr[i]--;
             }
         }
         boolean x = true;
         for (int i = 0; i < 256; i++) {
             if (arr[i] != 0) {
                 x = false;
                return false;
             }
         }
      return x;
    }
}

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        String A = st.next();
        String B = st.next();
        st.close();
        A = A.toLowerCase();
        B = B.toLowerCase();

        boolean X = Anagrams(A, B);
       System.out.println(X);
    }
}
//anagramm
//marganaa