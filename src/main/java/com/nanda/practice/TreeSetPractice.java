package com.nanda.practice;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {


    public static void main(String[] args) {

        Set<Stocks> stocksSet = new TreeSet<Stocks>(new StockPeComparator());

        stocksSet.add(new Stocks(21.2f,"IRFC"));
        stocksSet.add(new Stocks(11.2f,"CIP"));
        stocksSet.add(new Stocks(41.2f,"AIP"));

        stocksSet.forEach(System.out::println);
    }

}


class Stocks {
    float pe;
    String name;

    public Stocks(float pe, String name) {
        this.pe = pe;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stocks{" +
                "pe=" + pe +
                ", name='" + name + '\'' +
                '}';
    }
}

class StockPeComparator implements Comparator<Stocks> {

    @Override
    public int compare(Stocks o1, Stocks o2) {
        return Math.round(o1.pe - o2.pe);
    }
}
