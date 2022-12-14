package scjp;

public class SCJPPractice {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        String s1 = "123";

        sb1.append("abc");
        s1 = s1.concat("abc");
        System.out.println(sb1 + " " + s1);

        // Which code fragment, inserted at line 24, outputs "123abc 123abc"?
    }
}
