package oop.interfaces.multipleinheritance;

public interface NewBornChild extends Mother, Father{

    default void teachMathematics() {
        Mother.super.teachMathematics();
        Father.super.teachMathematics();
    }
}
