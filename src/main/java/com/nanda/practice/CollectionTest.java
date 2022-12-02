package com.nanda.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

class Product {

    int num;
    String name;
    float price;

    public Product(int num, String name, float price) {
        this.num = num;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class CollectionTest {






    public static void main(String[] args) {
//        Collection



        // duplicates allowed
        // insertion order preserved


        ArrayList names = new ArrayList();
        names.add("nanda");
        names.add("kumar");
        names.add("raj");
        names.add("nanda");
        names.add(10);
        names.add(0,null);

        ArrayList newNames = (ArrayList )names.clone();

//        System.out.println(newNames instanceof ArrayList);





        Iterator iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }




        names.remove("nanda");

        names.forEach(name -> {
            System.out.println(name);
        });

        System.out.println(names.remove("kk"));

        names.set(0,"ramasamy");

        System.out.println(names);

        System.out.println(newNames);


        Vector vNames = new Vector(20);
        vNames.add("nanda");

//        newNames.stream().map(name -> {
//            return newNames.add(name+"hello");
//        });


        newNames.forEach(name -> {
            vNames.add(name);
        });

        System.out.println(vNames);
        //System.out.println(newNames);

        List<Product> productsList = new ArrayList<Product>();
        //Adding Products


        List<Product> v =  productsList.stream().filter(p -> {
            return p.price < 30000f;
        }).map(p -> {p.price = p.price - 1000; return p;}).collect(Collectors.toList());

        v.forEach(p-> System.out.println(p.toString()));
    }
}
