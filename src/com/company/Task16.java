package com.company;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int myRandom = (int)Math.floor(Math.random()*(101)+0);
        int num;
        System.out.println(myRandom);

        for (;;){
            System.out.println("nermuceq tiv");
            num = scanner.nextInt();
            if (num> myRandom){
                System.out.println("mec e");
            }
            if (num<myRandom){
                System.out.println("poqr e");
            }
            if(num==myRandom){
                System.out.println("haxtecik");
                break;
            }
        }
    }
}
