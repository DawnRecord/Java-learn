package cn.dawnrecord;

/**
 * @program: OnJava8
 * @author: Dawn
 * @create: 2020-12-03 11:42
 */
// housekeeping/SimpleConstructor2.java
// Constructors can have arguments

class Rock2 {
    Rock2(int i) {
        System.out.print("Rock " + i + " ");
    }

    public Rock2() {

    }
}

public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            new Rock2(i);
            new Rock2();
        }
    }
}
