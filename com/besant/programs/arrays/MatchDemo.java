package com.besant.programs.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    private int id;
    private String name;
    private String gender;
    private int marks;

    public Student(int id, String name, String gender, int marks) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getMarks() {
        return marks;
    }
}
public class MatchDemo {
    public static void main(String[] args) {
        List<Student> students= new ArrayList<>();
        students.add(new Student(1,"Bala","M",67));
        students.add(new Student(2,"Ram","M",21));
        students.add(new Student(3,"Pavi","F",67));
        students.add(new Student(4,"Abi","F",90));
        students.add(new Student(5,"Guna","M",67));

        // All the students are passed.  marks >50;// All Match
        boolean allPass=true;
        for(int i=0;i<students.size();i++){
            Student student= students.get(i);
            if(student.getMarks() < 50){
                allPass=false;
                break;
            }

        }

       boolean allMatch= students.stream()
               .allMatch(student -> student.getMarks()>50);

        // Any Students scored more than 90

        boolean anyMatch=students.stream().anyMatch(student -> student.getMarks()>90);
        // No students scored less than 30;

        boolean noneMatch=students.stream().noneMatch(student -> student.getMarks() <30);

        // Print the Name and Marks of female students.  // Terminal
       List<Student> femaleStudentList= students.stream().filter(student -> student.getGender().equals("F"))
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
               // .forEach(student -> System.out.println(student.getName()+ ": "+ student.getMarks()));

       List<String> studentNames= students.stream().filter(student -> student.getGender().equals("F"))
                .sorted(Comparator.comparing(Student::getName))  // Stream<Students>
                .map(student -> student.getName()) // Stream<String>
                .collect(Collectors.toList());

        long count=students.stream().filter(student -> student.getMarks()>50)
                .count();

        // Max marks - Student Name
        students.stream().max(Comparator.comparing(Student::getMarks)).get().getName();

        // Min





    }
}
