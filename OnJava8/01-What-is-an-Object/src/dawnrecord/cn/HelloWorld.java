package dawnrecord.cn;

import dawnrecord.B2;
import dawnrecord.cn.next.B;

/**
 * @program: OnJava8
 * @author: Dawn
 * @create: 2020-12-02 11:49
 *
 * default 必须在同一包下
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        A a = new A();
        a.id = 1;
        System.out.println(a.id);

        B b = new B();
//        b.id
        B1 b1 = new B1();
        b1.id = 2;
        System.out.println(b1.id);

        B2 b2 = new B2();
//        b2.id
    }
}
