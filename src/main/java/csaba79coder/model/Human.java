package csaba79coder.model;

public class Human {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector in action! Deleted one object!");
    }
    public String name;

    public Human(String name) {
        this.name=name;
    }
}
