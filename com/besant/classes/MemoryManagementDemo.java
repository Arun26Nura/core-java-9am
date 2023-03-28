package com.besant.classes;

public class MemoryManagementDemo {
    public static void main(String[] args) {
        MemoryManagementDemo memoryManagementDemo= new MemoryManagementDemo();
        memoryManagementDemo.add(2, 3);
    }

    private void add(int i, int i1) {
        MemoryManagementDemo memoryManagementDemo= new MemoryManagementDemo();

        int c= i+i1;
        memoryManagementDemo.remove(23,34);
    }

    private void remove(int i, int i1) {
        System.out.println(i);
    }
}
