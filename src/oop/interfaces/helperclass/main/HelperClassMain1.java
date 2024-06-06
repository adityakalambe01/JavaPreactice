package oop.interfaces.helperclass.main;

import oop.interfaces.helperclass.HelperClass;
import oop.interfaces.helperclass.HelperInterface;

public class HelperClassMain1 extends HelperClass implements HelperInterface {
    @Override
    public void display1() {
        System.out.println("Display 1 called");
    }

}
