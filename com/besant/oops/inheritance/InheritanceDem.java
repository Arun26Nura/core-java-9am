package com.besant.oops.inheritance;

class A{
    A(int number){
        this.number=number;
    }
    int number;
    public void add(){
        System.out.println("A");
    }
    public void remove(){
        System.out.println("A remove");
    }
}
class B extends A{
   B(int a){
      super(20);
       this.a=a;
   }

   int a;

    public void add(){
        System.out.println("B");
    }

   @Override
    public void remove(){
        System.out.println("Remove");
    }
}

class C extends B{
    C(){
        super(10);
    }
    public void add(){
        System.out.println("C");
    }

}
public class InheritanceDem {
    public static void main(String[] args) {
        B b= new B(10);
        b.add();
        A a = new A(10);
        a.add();
        C c= new C();
        c.add();

    }
}
