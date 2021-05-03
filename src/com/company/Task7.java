package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i = num; i>=1; i--){
            if(i%2==0){
                System.out.println(i);
            }
            if(num==1){
                System.out.println("1-@ kent e");
            }
        }

    }
}
