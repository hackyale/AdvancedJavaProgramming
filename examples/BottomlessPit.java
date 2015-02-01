public class BottomlessPit implements Fillable {
    public int getCapacity() {
        return 1;
    }

    public int getItemCount() {
        return 0;
    }
    
    public boolean addItem() {
        return true;
    }

    public boolean removeItem() {
        return false;
    }

}
