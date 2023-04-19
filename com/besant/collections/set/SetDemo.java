package com.besant.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> hashset= new HashSet<>();
        hashset.add(1);
        hashset.add(4);
        hashset.add(0);
        System.out.println(hashset);
        hashset.add(23);
        System.out.println(hashset);


        Set<Integer> linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(1);
        linkedHashSet.add(4);
        linkedHashSet.add(0);
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);
        linkedHashSet.add(23);
        System.out.println(linkedHashSet);


        Set<Integer> treeSet= new TreeSet<>();
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(0);
      //  treeSet.add(null);
        System.out.println(treeSet);
        treeSet.add(23);
        System.out.println(treeSet);

        Set<String> names= new TreeSet<>();
        names.add("chennai");
        names.add("bangalore");
        names.add("Chennai");
        names.add("Bangalore");
        System.out.println(names);



    }
}
