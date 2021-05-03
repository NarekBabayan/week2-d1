package com.company;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("xDollar = ");
        int xDollar = scanner.nextInt();
        System.out.println("pTokos = ");
        int pTokos = scanner.nextInt();
        System.out.println("yDollar = ");
        int yDollar = scanner.nextInt();
        int year=0;

        if(xDollar<yDollar) {
            for (; ; ) {
                xDollar = xDollar + (xDollar * pTokos / 100);
                year++;
                if (xDollar >= yDollar) {
                    break;
                }
            }
            System.out.println(year);
        }else{
            System.out.println("pleace do not xDollar>yDollar");
        }


    }
}
