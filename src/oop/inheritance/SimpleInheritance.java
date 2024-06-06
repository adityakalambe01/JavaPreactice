package oop.inheritance;

class Parent{

    public void addTwoNumber(int number, int number2){
        System.out.println(number+number2);
    }
    public void displaySomething(String something){
        System.out.println(something);
    }
}

class Child extends Parent{
    public void addThreeNumber(int number, int number2, int number3){
        System.out.println(number+number2+number3);
    }
}


public class SimpleInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.addTwoNumber(10,20);
        child.displaySomething("hello");
        child.addThreeNumber(10,20,30);
    }
}
