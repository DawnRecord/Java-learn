package dawnrecord.cn;

import java.math.BigInteger;

/**
 * @program: OnJava8
 * @author: Dawn
 * @create: 2020-12-02 15:58
 */
public class Main {
    public static void main(String[] args) {
        Character character = new Character('c');
        System.out.println(character);

        Integer integer = new Integer(2);

        char c = 'x';
        Character ch = new Character(c);

        BigInteger bigInteger = new BigInteger("333");
        BigInteger abs = bigInteger.abs();
        System.out.println(abs);
    }
}
