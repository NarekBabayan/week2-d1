package com.company;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a=1,b=1,c=1;
        int index=1;

        for(;c<=num; ){
            c=a+b;
            a=b;
            b=c;
            index++;
        }

        if(num==a){
            System.out.println(index);
        }else {
            System.out.println(-1);
        }

    }
}
