// q43: Lambda expression
package it201;

import java.util.ArrayList;

public class q43 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.forEach(n -> System.out.println(n * n));
    }
}
