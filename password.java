package exercise;
/*
Write a method that checks whether a string is a valid password.
A password must have at least eight characters.
A password consists of only letters and digits.
A password must contain at least two digits.
*/

import java.util.Scanner;

class cheak_password{
    public boolean charecter(int n){
        return (n >= 8);
    }
    public boolean degit(String str, int n){
        int count=0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i)<='9') {count ++;}
        }
        return (count>=2);
    }
    public boolean degit1 (String str,int n){
        boolean cheak =true;
        boolean [] arr =new boolean[n];
        for (int i = 0; i <n ; i++) {
            char ch = str.charAt(i);
            arr[i]= ((ch >= '0'&&ch<='9')||(ch>='A'&& ch<='Z')||(ch>='a'&& ch <= 'z'));
        }
        for (int i = 0; i <n ; i++) {
            if (arr[i]) {
                continue;
            }
            cheak =false;
        }
       return cheak;
    }

}
public class password {
    public static void main(String[] args) {
        Scanner st =new Scanner(System.in);
        String str =st.nextLine();
        st.close();
         cheak_password cp=new cheak_password();
        if (cp.charecter(str.length())&&cp.degit(str,str.length())&&cp.degit1(str,str.length())) {
            System.out.println("** this is a correct password **");
        }
        else if (!cp.charecter(str.length())) {
            System.out.println("password must have at least eight characters.\n### this is a wrong password ###");
        }
        else if (!cp.degit(str,str.length())) {
            System.out.println("password must contain at least two digits.\n### this is a wrong password ###");
        }
        else if (!cp.degit1(str,str.length())) {
            System.out.println("password consists of only letters and digits.\n### this is a wrong password ###");
        }

    }//main end
}
