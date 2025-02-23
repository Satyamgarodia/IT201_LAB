// q32: ArrayList operations
package it201;

import java.util.ArrayList;

public class q7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.set(1, "Grapes");
        list.remove("Apple");
        list.clear();
        System.out.println(list);
    }
}
