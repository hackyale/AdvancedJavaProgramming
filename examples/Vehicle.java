public abstract class Vehicle implements Moveable, Fillable {
    private int capacity;
    private int load;

    public Vehicle(int capacity) {
        this.capacity = Math.max(capacity, 0);
    }

    public int getItemCount() {
        return load;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean addItem() {
        boolean canAddCargo = !isFull();
        load += canAddCargo ? 1 : 0;
        return canAddCargo;
    }

    public boolean removeItem() {
        boolean canRemoveCargo = !isEmpty();
        load -= canRemoveCargo ? 1 : 0;
        return canRemoveCargo;
    }
}
