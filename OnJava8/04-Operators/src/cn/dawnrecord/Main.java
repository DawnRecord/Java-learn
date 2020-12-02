package cn.dawnrecord;

import java.util.Random;

/**
 * @program: OnJava8
 * @author: Dawn
 * @create: 2020-12-02 17:36
 */
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int i = a / b;
        System.out.println(i);
        double v = a / (b + 0.0);
        System.out.println(v);
        System.out.println("\n");
        Random random = new Random();
        int i1 = random.nextInt(100) + 1;
        System.out.println("i1 " + i1);
        System.out.println("\n");

        Integer n1 = 47;
        Integer n2 = 47;
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        Integer n3 = 128;
        Integer n4 = 128;
        System.out.println(n3 == n4);
        System.out.println(n3 != n4);

        System.out.println(n3.equals(n4));
        System.out.println("\n");

        var v1 = 4;
        System.out.println(v1);


    }

}
