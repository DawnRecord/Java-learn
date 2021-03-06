package cn.dawnrecord;
import java.util.*;
/**
 * @program: OnJava8
 * @author: Dawn
 * @create: 2020-12-02 19:18
 */
// operators/Bool.java
// 关系运算符和逻辑运算符
public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(22);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i > j is " + (i > j));
        System.out.println("i < j is " + (i < j));
        System.out.println("i >= j is " + (i >= j));
        System.out.println("i <= j is " + (i <= j));
        System.out.println("i == j is " + (i == j));
        System.out.println("i != j is " + (i != j));
        // 将 int 作为布尔处理不是合法的 Java 写法
        //- System.out.println("i && j is " + (i && j));
        //- System.out.println("i || j is " + (i || j));
        //- System.out.println("!i is " + !i);
        System.out.println("(i < 10) && (j < 10) is "
                + ((i < 10) && (j < 10)) );
        System.out.println("(i < 10) || (j < 10) is "
                + ((i < 10) || (j < 10)) );
    }
}