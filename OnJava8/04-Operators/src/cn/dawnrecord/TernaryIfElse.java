package cn.dawnrecord;

/**
 * @program: OnJava8
 * @author: Dawn
 * @create: 2020-12-02 20:51
 */
// operators/TernaryIfElse.java
public class TernaryIfElse {

    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }

    static int standardIfElse(int i) {
        if(i < 10)
            return i * 100;
        else
            return i * 10;
    }

    public static void main(String[] args) {
        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(standardIfElse(9));
        System.out.println(standardIfElse(10));

        boolean b1 = true;
        boolean b2 = true;
        while (b1 = b2){
            System.out.println(1);
        }
    }
}

