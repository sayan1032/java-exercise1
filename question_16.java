package exercise;
/*Write a java program that reads in a set of n single digits
and converts them into a single decimal integer. For example,
the program should convert the set of 5 digits {2, 7, 4, 9, 3} to the integer 27493.
 */

import java.util.Scanner;

public class question_16 {
    public static void main(String[] args) {
        System.out.print("how many number you want to enter  ");
        Scanner st =new Scanner(System.in);
        int n=st.nextInt();
       st.close();
        int [] arr= new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print(i+"no num ");
            arr [i]=st.nextInt();
            System.out.println("");
        }
int num=0;
        for (int i = 0; i <n; i++) {
            int sum=num*10+arr[i];
            num=sum;
        }

        System.out.println(num);
    }
}
