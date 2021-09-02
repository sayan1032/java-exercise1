package exercise;
import java.util.*;
public class new1 {public static void main(String[] args) {
    Scanner st =new Scanner(System.in);
    String s = st.next();
    st.close();
    int num=0;
    for(int i=0; i<s.length();i++){
        if(s.charAt(i)==s.charAt(s.length()-i-1)){
            num++;
        }
    }
    
    if(num==s.length()){
        System.out.println("Yes");
    }
    else{
      System.out.println("No");  
    }
}    
}
