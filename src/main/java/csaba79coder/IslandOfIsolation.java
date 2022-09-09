package csaba79coder;

import csaba79coder.model.Human;

public class IslandOfIsolation {

    public static void main(String[] args) {

        Human human1 = new Human("Shraman");
        Human human2 = new Human("Debanjan");
        human1.name = human2.name;
        human2.name = human1.name;
        human1 = null;//Nullifying the first object
        human2 = null;//nullifying the second object.

        System.gc();//calling the garbage collector.
    }
}
