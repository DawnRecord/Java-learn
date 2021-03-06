package cn.dawnrecord;

import java.util.Objects;

/**
 * @program: OnJava8
 * @author: Dawn
 * @create: 2020-12-02 18:01
 */
// operators/EqualsMethod2.java
// 默认的 equals() 方法没有比较内容
class Value {
    int i;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return i == value.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }
}

public class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
    }
}