package oop.inheritance;

class GrandParent{
    void grandParentsProperties(){
        System.out.println("GrandParent's properties");
    }
}
class Parents extends GrandParent{
    void parentsProperties(){
        System.out.println("Parent's properties");
    }
}
class Childs extends Parents{
    void childsProperties(){
        System.out.println("Child's properties");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Childs childs = new Childs();

        childs.grandParentsProperties();
        childs.parentsProperties();
        childs.childsProperties();
    }
}
