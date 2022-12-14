package com.nanda;

        //  String Input = “Abc123Xyz456”;
        //  Output = cba123zyx456


import com.sun.org.apache.xpath.internal.functions.Function;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionOne {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("([a-z]+)(\\d*)",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Abc123Xyz456");

        StringBuffer sb = new StringBuffer();

        while (matcher.find()) {
            StringBuffer s = new StringBuffer(matcher.group(1).toLowerCase());
            sb.append(s.reverse());
            matcher.appendReplacement(sb, matcher.group(2));





        }

        System.out.println(sb.toString());
    }


}
