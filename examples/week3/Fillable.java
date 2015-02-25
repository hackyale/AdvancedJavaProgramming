public interface Fillable {
    public int getCapacity();
    public int getItemCount();

    public boolean addItem();
    public boolean removeItem();

    public default boolean isEmpty() {
        return getItemCount() == 0;
    }

    public default boolean isFull() {
        return getItemCount() == getCapacity();
    }
}
