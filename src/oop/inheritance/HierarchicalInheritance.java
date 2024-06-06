package oop.inheritance;

class Parent1{
    void showData(){
        System.out.println("Parent.showData()");
    }

}

class Child1 extends Parent1{
    void showChild1Data(){
        System.out.println("Child1.showChild1Data()");
    }
}

class Child2 extends Parent1{
    void showChild2Data(){
        System.out.println("Child2.showChild2Data()");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

        Child1 child1 = new Child1();
        child1.showData();
        child1.showChild1Data();

        Child2 child2 = new Child2();
        child2.showData();
        child2.showChild2Data();




    }
}
