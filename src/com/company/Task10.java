package com.company;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char myChar;

        for(int i=32; i<=132; i=i+10){

            for(int j=i; j<=i+9;j++){
                myChar = (char) j;
                System.out.print(myChar);
            }
            System.out.println("\n");

        }


    }
}
