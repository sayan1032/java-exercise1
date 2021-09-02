package exercise;
/*Given two numbers d and e are suspected of being consecutive members of the Fibonacci sequence.
Write a java program that will refute or confirm this conjecture.*/
import java.util.Scanner;

public class febonacci_3num {
    public static int function(int n) {
        if (n == 1 || n == 2) { return (n - 1); }

        else {
            return (function(n-1)+function(n-2));
        }

    }
    public static void main(String[] args) {
        Scanner st =new Scanner(System.in);
        int m1,m2;
        m1=st.nextInt(); m2=st.nextInt();
        st.close();
        if (m1 > m2) {
            int i1;
            i1=m2;m2=m1;m1=i1;
        }
        int i=1;
        while(function(i)<=m2){
           // System.out.println(function(i));
            if (function(i) == m1 && function(i+1)==m2) {
                System.out.println("yes");
                break;
            }
            i++;
        }
    }//main end
}
