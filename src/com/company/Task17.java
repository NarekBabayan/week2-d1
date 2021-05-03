package com.company;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int add = 0;
        int a;

        for(;num!=0;){
         a = num%10;
         num = num - a;
         num = num/10;
         add = add + a;
        }
        System.out.println(add);

    }
}
