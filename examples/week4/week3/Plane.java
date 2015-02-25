public class Plane extends Vehicle {
    public Plane() {
        this(1000);
    }

    public Plane(int capacity) {
        super(capacity);
    }

    public void move() {
        System.out.println("Take off!");
    }
}
