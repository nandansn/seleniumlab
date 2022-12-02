package com.nanda.java.fundamental;

public class StaticTest {



    int instanceVariable;
    static {
        System.out.println("static block");

    }

    public StaticTest() {
        System.out.println("constructor");
        this.instanceVariable = 10;
    }

    public void printVariables() {
        System.out.println(this.instanceVariable);
    }


    public static void main(String[] args) {

        System.out.println("main");
        new StaticTest().printVariables();
        System.out.println("hello");
    }
}
