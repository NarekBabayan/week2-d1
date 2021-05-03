package com.company;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int index = 0;
        int calc=1;

        for (;;){

           for (;;){
               calc=calc*2;
               index++;
               if(calc>=num){
                   break;
               }
            }
            System.out.println(index);
           break;

        }
    }
}
