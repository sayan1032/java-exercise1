package exercise;

import java.util.*;
public class tokens {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        String s= st.nextLine();
        st.close();
        s=s.trim();
        System.out.println(s);
        String [] arr =s.split("[ !,?._'@\\s]+");
        System.out.println(arr.length);
        for (String se : arr) {
            System.out.println(se);
        }



    }
    
}
