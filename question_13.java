package exercise;

/*Write a java program to generate the sequence where each member is the sum of the adjacent factorials.
f3=1! + 0!
f4=2! + 1!
f5=3! + 2!
Note that by definition 0! = 1.
 */

import java.util.Scanner;

public class question_13 {
    public static int factorial(int n){
        int a=1;
        if (n==0){return 1;}
        else { for (int i = 1; i <=n ; i++) { a *=i; } return a;}
    }
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int n= st.nextInt();
        st.close();
        for (int i = 1; i <=n ; i++) {
            int sum=0;
            sum=factorial(i)+factorial(i-1);
            System.out.println(sum);

        }
    }
}
