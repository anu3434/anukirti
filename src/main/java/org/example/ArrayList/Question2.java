package org.example.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public static void getAllStringName(){
        List<String> name = new ArrayList<>();
        name.add("Sandhya");
        name.add("Rashi");
        name.add("Nisha");
        name.add("Alka");
        name.add("Yashu");
       for (int i = 0; i<name.size(); i++){
          String n =  name.get(i).toUpperCase();
           System.out.println(n);
       }

    }

    public static void getAllTotalMarks(){
        List<Integer> totalMarksList = new ArrayList<>();
        int total = 0;
        totalMarksList.add(78);
        totalMarksList.add(64);
        totalMarksList.add(36);
        totalMarksList.add(26);
        totalMarksList.add(16);

        for (int i = 0 ; i<totalMarksList.size(); i++){
            total = totalMarksList.get(i) + total;
        }
        System.out.println("Total Marks = " + total);
    }


    public static void main(String[] args) {
       Question2.getAllStringName();
       getAllTotalMarks();
    }
}
