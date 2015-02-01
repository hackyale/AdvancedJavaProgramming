public class Car extends Vehicle {
    private static int totalNumCars = 0;

    public static int getTotalNumCars() {
        return totalNumCars;
    }

    private String model;
    private int milesDriven;
    private boolean isOn;

    public Car(String model) {
        super(0);
        this.model = model;
        totalNumCars++;
    }

    public String getModel() {
        return model;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void drive(int milesToDrive) {
        if (isOn && milesToDrive > 0) {
            move();
            if (milesToDrive + milesToDrive > 0) {
                milesDriven += milesToDrive;
            } else {
                milesDriven = Integer.MAX_VALUE;
            }
        }
    }

    public void move() {
        System.out.println("Hitting the road!");
    }

}
