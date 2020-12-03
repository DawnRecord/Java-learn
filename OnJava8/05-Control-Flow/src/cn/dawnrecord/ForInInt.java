package cn.dawnrecord;

import static cn.dawnrecord.onjava.Range.*;

/**
 * @program: OnJava8
 * @author: Dawn
 * @create: 2020-12-03 10:50
 */
// control/ForInInt.java
public class ForInInt {
    public static void main(String[] args) {
        for(int i : range(10)) // 0..9
            System.out.print(i + " ");
        System.out.println();
        for(int i : range(5, 10)) // 5..9
            System.out.print(i + " ");
        System.out.println();
        for(int i : range(5, 20, 3)) // 5..20 step 3
            System.out.print(i + " ");
        System.out.println();
        for(int i : range(20, 5, -3)) // Count down
            System.out.print(i + " ");
        System.out.println();
    }
}

