package com.nanda.practice;


import java.util.LinkedList;
import java.util.List;

public class StackQueuePractice {

    public static void main(String[] args) {


        LinkedList<Product> products = new LinkedList<>();

//        products.addLast(new Product(1,"HP Laptop",25000f));
//        products.addLast(new Product(2,"Dell Laptop",29000f));
//        products.addLast(new Product(3,"Lenevo Laptop",28000f));
//        products.addLast(new Product(4,"Sony Laptop",28000f));
//        products.addLast(new Product(5,"Apple Laptop",90000f));

        addToQ(products, new Product(1,"HP Laptop",25000f));
        addToQ(products, new Product(2,"Dell Laptop",29000f));

        display(products);

        removeFromQ(products);

        display(products);

        addToStack(products, new Product(3,"Lenevo Laptop",28000f));
        addToStack(products, new Product(4,"Apple Laptop",28000f));
        addToStack(products, new Product(5,"Linux Laptop",28000f));

        removeFromStack(products);

        display(products);




    }


    public static void addToQ(LinkedList<Product> products, Product product) {

        products.addLast(product);

    }

    public static void removeFromQ(LinkedList<Product> products) {

        products.removeFirst();

    }

    public static void display(LinkedList<Product> products) {


        System.out.println("================================");

        products.forEach(System.out::println);

    }



    public static void addToStack(LinkedList<Product> products, Product product) {

        products.addLast(product);

    }

    public static void removeFromStack(LinkedList<Product> products) {

        products.removeLast();

    }






}



