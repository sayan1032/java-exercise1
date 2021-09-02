//Write a method that returns a new array by eliminating the duplicate values


package exercise;
import java.util.*;
     public class elimineting {
            public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter Array Size ");
            int n = sc.nextInt();
            sc.close();
            int [] arr = new int [n];
          
            for (int i=0; i<n; i++) {arr[i] = sc.nextInt();}

            for (int i=0; i<n; i++) {
              boolean  flag = true;
                for (int j=i+1; j<n; j++) {
                    if (arr[i]==arr[j])
                    {   flag = false;break;   }
                }
                if (flag)
                    System.out.print(arr[i]+" ");
            }

        }
    }
