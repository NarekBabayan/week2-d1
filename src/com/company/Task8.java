package com.company;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            int index=1;


            for (; ; ){

                int log=1;

                for(;;){
                    log = log * 2;
                    if(log>=num) {
                        break;
                    }
                }

                if(num==log){
                    System.out.println(log);
                    System.out.println("qanak = "+index);
                    break;

                }else {
                    index++;
                    num = scanner.nextInt();

                }

            }



    }
}
