package com.company;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         int num ;
         int k;
         int bignum = 0;
         int secondmax = 0;
         for(int i = 0; ; i++){
             num = scanner.nextInt();
             if(num == 0){
                 System.out.println(secondmax);
                 break;
             }
             if(bignum<= num){
                 k= bignum;
                 bignum=num;
                 if(k<bignum){
                     secondmax=k;
                 }
             }else if(secondmax<num){
                 secondmax=num;
             }
         }
    }
}
