package dawnrecord.cn;

/**
 * @program: OnJava8
 * @author: Dawn
 * @create: 2020-12-02 17:18
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));

    }
}
