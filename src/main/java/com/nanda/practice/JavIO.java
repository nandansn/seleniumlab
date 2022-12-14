package com.nanda.practice;

import java.util.Scanner;

public class JavIO {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();
        String str = read.next();

        System.out.println(String.format("%d %s",n,str ));
    }
}
