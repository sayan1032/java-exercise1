package exercise;

import java.util.Scanner;

class array{
    int[]arr=new int[100];
    int count=0,num=0;
    public void setArr() {
        System.out.println("enter your numbers");
       do{
           Scanner st =new Scanner(System.in);
           num=st.nextInt();
           st.close();
           arr[count]=num;
           count++;
       }while(num!=0);
    }
    int  num1 =arr[0];
    public void small(){
        for (int i = 0; i <count-1 ; i++) {
            if (num1 >arr[i]) {
                num1=arr[i];
            }
        }
        System.out.println(num1);
    }


}


public class a7_q4 {
    public static void main(String[] args) {
      array ar= new array();
      ar.setArr();
      ar.small();


    }//end main
}