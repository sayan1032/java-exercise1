package com.company;
import java.util.Random;
//import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class random
{
    public static void main(String[] args)
    {
        Random rand =new Random();

        System.out.println(rand.nextInt(5));
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextBoolean());
        System.out.println("this  " +Math.random());
        System.out.println("this is the   " +ThreadLocalRandom.current().nextInt(5));
    }
}
