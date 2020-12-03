package cn.dawnrecord;

/**
 * @program: OnJava8
 * @author: Dawn
 * @create: 2020-12-03 11:17
 */
public class Main {
    private int i;
    Main(){
        i = 0;
    }
    Main(int i){
        this();
        this.i = i;

    }
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        new Main().f();
    }

    int f(){
        return 9;
    }
}
