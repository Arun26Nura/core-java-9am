package com.besant.oops.encapsulation;

class Students{
    private int id;
    private String name;

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }

    public String getName() {
     //   if(user == admin){
        return name;
        //}
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo= new EncapsulationDemo();
        Students students= encapsulationDemo.returnUserDetails();
        System.out.println(students.getId());
        System.out.println(students.getName());
    }

    public Students returnUserDetails(){
        Students students= new Students();

        int id=2;
        String name="Arun";
        students.setId(id);
        students.setName(name);

        return students;
    }
}


