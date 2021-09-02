package com.company;
//import com.sun.source.tree.CaseTree;

import java.util.Scanner;
import java.util.Random;
public class Rock_paper_secissor_game {
    public static void main(String[] args) throws Exception
    {
        Random rand =new Random();
        Scanner st=new Scanner(System.in);
        System.out.println("welcome to the game");
        System.out.println("your turn");
        System.out.println("enter 0 for rock\nenter 1 for paper\nenter 2 for secissor");
        int user_num=st.nextInt();
        st.close();
        if (user_num<3)
        {
            switch (user_num) {
                case 0:
                    System.out.println("you choose rock");
                    break;
                case 1:
                    System.out.println("you choose paper");
                    break;
                case 2:
                    System.out.println("you choose sceissor");
                    break;
                default:
                    System.out.println("you choose a wrong input");
            }

            System.out.println("now computers turn");
            int computer_num = rand.nextInt(3);
            switch (computer_num) {
                case 0:
                    System.out.println("computer choose rock");
                    break;
                case 1:
                    System.out.println("computer choose paper");
                    break;
                case 2:
                    System.out.println("computer choose sceissor");
                    break;
            }

            if (user_num == computer_num) {
                System.out.println("this is a draw");
            } else if (user_num == 0 && computer_num == 1) {
                System.out.println("computer win");
            } else if (user_num == 1 && computer_num == 2) {
                System.out.println("computer win");
            } else if (user_num == 2 && computer_num == 0) {
                System.out.println("computer win");
            } else {
                System.out.println("you win");
            }
        }
      }
    }
