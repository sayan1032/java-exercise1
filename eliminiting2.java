package exercise;
//Write a method that returns a new array by eliminating the duplicate values

import java.util.Scanner;

public class eliminiting2 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.print("enter your array size ");
        int n = st.nextInt();
       
        int []arr=new int [n];
        System.out.println("enter your array eliments");
        boolean [] arr2= new boolean[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=st.nextInt();
            arr2[i]=true;
        }
        //elimineting code
      System.out.println("this is the new array");
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if (arr[i] == arr[j]) {
                    arr2[j]=false;
                }
            }

            if (arr2[i]) {
                System.out.print(arr[i]+" ");
            }

        }
        st.close();
    }//main end
}
