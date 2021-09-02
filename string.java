package exercise;

import java.util.Scanner;

/* Write java method called count accepts a string as input and returns the number of vowels in it.
   Write a java method to check a string is palindrome or not.*/
public class string {
    public static void main(String[] args) {
       Scanner st = new Scanner(System.in);
        String str = st.nextLine();
        st.close();
       // String strrev;
        int count=0;
        for (int i = 0; i <str.length() ; i++)
        { //System.out.print(str.charAt(i)+" ");
            char ch=str.charAt(i);
            if (ch =='a'||ch =='e'||ch =='i'||ch =='o'|| ch =='u') { System.out.print(ch+", "); count++; }
        }
        System.out.println(count);
        
    }//main end
}
//str.charAt(i) =='a'||str.charAt(i) =='e'||str.charAt(i) =='i'||str.charAt(i) =='o'|| str.charAt(i) =='u'