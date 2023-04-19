package com.besant.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
      //  String[] strings= new String[5];

        List<String>  arrayList= new ArrayList<>(); // 10
        arrayList.add("chennai");
        System.out.println(arrayList);


        List<String> stringList= new LinkedList<>();
        // Addition of values to collections
        stringList.add("Bangalore");
        stringList.addAll(arrayList);
        stringList.add(0,"Delhi");
        System.out.println(stringList);
        // Value removal
        stringList.removeAll(arrayList);
        stringList.add("Delhi");
        System.out.println(stringList);
        //
        int size=stringList.size();
        int indexof=stringList.indexOf("Delhi");
        System.out.println(indexof);
        int lastIndexOf=stringList.lastIndexOf("Delhi");
        System.out.println(lastIndexOf);


        stringList.retainAll(arrayList);

        String val= stringList.get(0);


        List<Integer> list= new LinkedList<>();
        int inp=5;
        list.add(inp);// Autoboxing
        int resul=list.get(0); // Unboxing






    }
}
