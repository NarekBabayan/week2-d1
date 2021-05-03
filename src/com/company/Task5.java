package com.company;

import java.util.Scanner;

public class Task5 {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int num2=1;
        System.out.println(1);

        for(; ;) {
            num2=num2*2;
            if(num2>num){
                break;
            }
            System.out.println(num2);
        }
    }
}
