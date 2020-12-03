package cn.dawnrecord;

import java.util.Random;

/**
 * @program: OnJava8
 * @author: Dawn
 * @create: 2020-12-03 10:43
 */
// control/ForInString.java

public class ForInString {
    public static void main(String[] args) {
        for (char c : "An African Swallow".toCharArray())
            System.out.print(c + " ");

        System.out.println();
        int[] arraysInt = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arraysInt[i] = random.nextInt(10) + 1;
        }
        for (int i :
                arraysInt) {
            System.out.print(i + " ");

        }
    }
}

