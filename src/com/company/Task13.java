package com.company;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nermuceq skzbnakan vazqi tivy");
        double vazq = scanner.nextDouble();
        System.out.println("nermuceq y kilometry");
        double y = scanner.nextDouble();
        int index = 1;

        if(vazq<y) {
            for (; ; ) {
                vazq = vazq + (vazq / 10);
                index++;
                if (vazq >= y) {
                    System.out.println(index);
                    break;
                }
            }
        }else{
            System.out.println(1);
        }

    }
}
