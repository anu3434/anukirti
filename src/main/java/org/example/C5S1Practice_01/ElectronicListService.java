package org.example.C5S1Practice_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ElectronicListService {
    public static List<ElectronicsList> getAllElectronicsItems(){
        LinkedList<ElectronicsList> electronicsList = new LinkedList<>();
        ElectronicsList list1 = new ElectronicsList("TV");
        ElectronicsList list2 = new ElectronicsList("Computer");
        ElectronicsList list3 = new ElectronicsList("Fridge");
        ElectronicsList list4 = new ElectronicsList("TV");
        electronicsList.add(list1);
        electronicsList.add(list2);
        electronicsList.add(list3);
        electronicsList.add(list4);
        return electronicsList;
    }

    public static List<String> addElectronicsItemsToList(String electronicsItems){
        List<String> list = new ArrayList<>();
        list.add(electronicsItems);
        System.out.println(list);
        return list;
    }



    public static boolean removeElectronicItemFromList(List<ElectronicsList> list , String removeItem) {
        boolean flag = false;
        Iterator iterator = list.listIterator();
        while (iterator.hasNext()) {
            ElectronicsList s = (ElectronicsList) iterator.next();
           if (s.getElectronicsItems().startsWith("C")){
               iterator.remove();
               flag = true;
           }
        }
        return flag;
    }

    public static int searchElectronicItem(List<String> list , String searchItem){
        List<ElectronicsList> electronicsLists = new ArrayList<>();
        electronicsLists.indexOf(electronicsLists);
        return 0;

    }

    public static void main(String[] args) {
        List<ElectronicsList> electronicsLists = ElectronicListService.getAllElectronicsItems();
        System.out.println("Electronics Items : " + electronicsLists);
        addElectronicsItemsToList("Tv, Computer, Refrigarator, Tv");
        System.out.println(ElectronicListService.removeElectronicItemFromList(electronicsLists,"Computer"));
    }
}
