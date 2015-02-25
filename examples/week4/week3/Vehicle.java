public abstract class Vehicle implements Moveable, Fillable {
    private int capacity;
    private int load;

    public Vehicle(int capacity) {
        this.capacity = Math.max(capacity, 0);
    }

    public int getCapacity() {
        return capacity;
    }

    public int getItemCount() {
        return load;
    }

    public boolean addItem() {
        boolean canAddItem = !isFull();
        load += canAddItem ? 1 : 0;
        return canAddItem;
    }

    public boolean removeItem() {
        boolean canRemoveItem = !isEmpty();
        load -= canRemoveItem ? 1 : 0;
        return canRemoveItem;
    }
}
