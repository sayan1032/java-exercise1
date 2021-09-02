package exercise;
//Write a java program using an array that reads the integers between 1 and 100 and counts the
//occurrences of each. Assume the input ends with 0. Here is a sample run of the program

import java.util.Scanner;
public class a7_q2_array {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int[] arr = new int[1000];
        int num = 0, count = 0;
        System.out.print("enter your numbers  ");
        //taking input from user
        do {
            num = st.nextInt();
            arr[count] = num;
            count++;
        } while (num != 0);
        //printing the inpus
        System.out.print("the numbers you entered  ");
        for (int i = 0; i < count-1; i++) {
            System.out.print(arr[i]+" ");
        }
        //shorting thr aray
        int temp=0;
        for (int i = 0; i < count - 1; i++) {
            for (int j = i+1; j < count - 1; j++) {
                if (arr[i] > arr[j] ) {
                  temp= arr[j] ;
                 arr[j]=arr[i];
                 arr[i]=temp;
                }
            }
        }
        //printing the shorted aray
        System.out.print("\nthe shorted arr is       ");
        for (int i = 0; i <count-1 ; i++) {
            System.out.print(arr[i]+" ");
        }
        //creating a  new unic array
        int count1=0;
        int [] unicarr=new int[count-1];

        for (int i = 0; i < count; i++) {
            if (arr[i] != arr[i+1]) {
                unicarr[count1]=arr[i];
                count1++;
            }
        }
        //printing the new unic array
        System.out.print("\nthe unic array is        ");
        for (int i = 0; i < count1; i++) {
            System.out.print(unicarr[i]+" ");
        }
       // System.out.println(""); System.out.println(count); System.out.println(count1);
        System.out.println("");
        for (int i = 0; i <count1 ; i++) {
            int count3=0;
            for (int j = 0; j <count ; j++) {
                if (unicarr[i] == arr[j]) {
                    count3++;
                }
            }
            System.out.println(unicarr[i]+" occurs "+ count3+" times");
        }
        st.close();
    }//main end
}
