package com.nanda.practice;




import java.util.HashSet;

public class HashPractice {

    public static void main(String[] args) {




            HashSet<String> hashSet = new HashSet<String>();

            hashSet.add("sunday");
            hashSet.add("monday");
            hashSet.add("sunday");
            hashSet.add(null);
            hashSet.add("");

            for (String string : hashSet.toArray(new String[hashSet.size()])) {
                System.out.println(string);
            }
        }


}
