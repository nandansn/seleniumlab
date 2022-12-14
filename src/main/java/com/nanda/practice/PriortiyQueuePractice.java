package com.nanda.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class PriortiyQueuePractice {

    public static void main(String[] args) {

        PriorityQueue<Book> books = new PriorityQueue<>();

        books.add(new Book(3,"vkj"));
        books.add(new Book(2,"sdf"));
        books.add(new Book(1,"abc"));
        books.add(new Book(4,"srt"));
        books.add(new Book(1,"cde"));
        books.add(new Book(5,"rmc"));
        books.add(new Book(1,"rmc"));

//       books.stream().sorted((a,b) -> a.compareTo(b) ).collect(Collectors.toList()).forEach(System.out::println);

        books.forEach(System.out::println);

    }
}


class Book implements Comparable<Book> {
    int rating;
    String title;

    public Book(int rating, String title) {
        this.rating = rating;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "rating=" + rating +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        if (o.rating > rating) {
            return 1;
        } else if (o.rating < rating) {
            return -1;
        } else {
            return 0;
        }

    }


//    @Override
//    public int compare(Book o1, Book o2) {
//        return 0;
//    }
}
