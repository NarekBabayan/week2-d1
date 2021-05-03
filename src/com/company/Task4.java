package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 2;
        while (i<=num){
            if(num%i==0){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
