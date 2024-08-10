package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("John");
        list.add("Jane");
        list.add("Bob");
        list.add(2,"marco");
        System.out.println(list.size());
        System.out.println(list.get(0));

        list.removeIf(x->x.charAt(0)=='M');
    }
}
