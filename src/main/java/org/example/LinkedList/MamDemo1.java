package org.example.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class MamDemo1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Python");
        list.add("Java");
        list.add("Programming");
        list.add("C++");
        System.out.println(list);
        list.addFirst("Anu");
        list.addLast("Kirti");
        System.out.println(list);
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        for (String st : list){

        }System.out.println(list);
        System.out.println();

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
           String s = (String) iterator.next();
           if (s.startsWith("J")){
                iterator.remove();
                System.out.println(list);
            }
        }
    }
}
