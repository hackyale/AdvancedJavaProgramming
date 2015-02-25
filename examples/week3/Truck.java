public class Truck extends Vehicle {
    public Truck() {
        this(100);
    }

    public Truck(int capacity) {
        super(capacity);
    }

    public void move() {
        System.out.println("Hitting the road!");
    }
}
