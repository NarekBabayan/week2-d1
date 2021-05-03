package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i=1;
        while (Math.pow(i,2)<=num){
            System.out.println(Math.pow(i,2));
            i++;
        }

    }
}
