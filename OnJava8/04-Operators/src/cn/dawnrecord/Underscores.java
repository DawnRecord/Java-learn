package cn.dawnrecord;

/**
 * @program: OnJava8
 * @author: Dawn
 * @create: 2020-12-02 20:25
 */
public class Underscores {
    public static void main(String[] args) {
        double d = 341_435_936.445_667;
        System.out.println(d);
        int bin = 0b0010_1111_1010_1111_1010_1111_1010_1111;
        System.out.println(Integer.toBinaryString(bin));
        System.out.printf("%x%n", bin); // [1]
        long hex = 0x7f_e9_b7_aa;
        System.out.printf("%x%n", hex);


        int i = 3_33_4_5;
        System.out.println(i);

        float f4 = 1e-43f; //10 的幂数
        System.out.println(f4);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 & b2);
        System.out.println(b1 | b2);
        System.out.println(b1 ^ b2);
        int i2 = 0;
        System.out.println(~i2);
    }
}