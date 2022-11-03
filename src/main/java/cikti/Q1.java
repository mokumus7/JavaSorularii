package cikti;

import java.util.ArrayList;
import java.util.List;

public class Q1 {

    List<String> list1=new ArrayList<String>();

    public static void main(String[] args) {
        Q1 obj1=new Q1();
        obj1.myMethod();
        obj1.list1.add("z");
        obj1.list1.add("t");
        System.out.println(obj1.list1);
    }

    public List<String> myMethod() {
        list1.add("x");
        list1.add("y");
        return list1;
    }
}
