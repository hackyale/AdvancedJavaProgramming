public class Boat extends Vehicle {
    public Boat() {
        this(5000);
    }

    public Boat(int capacity) {
        super(capacity);
    }

    public void move() {
        System.out.println("Ready to sail!");
    }
}
