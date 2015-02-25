import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myStringList = new ArrayList<String>();
        myStringList.add("hello");
        myStringList.add("goodbye");
        System.out.println("Size: " + myStringList.size());

        ArrayList<Integer> myIntList = new ArrayList<>();
        myIntList.add(6);
        myIntList.add(5);

        int sum = 0;
        for (int x : myIntList) {
            sum += x;
        }

        System.out.println(sum);







        // Vehicle[] vehicles = new Vehicle[3];
        // vehicles[0] = new Truck();
        // vehicles[1] = new Boat();
        // vehicles[2] = new Plane();

        // Fillable[] fillables = new Fillable[4];
        // fillables[0] = vehicles[0];
        // fillables[1] = vehicles[1];
        // fillables[2] = vehicles[2];
        // fillables[3] = new BottomlessPit();

        // for (int item = 0; item < 10000; item++) {
        //     for (Fillable fillable : fillables) {
        //         if (!fillable.isFull()) {
        //             fillable.addItem();
        //             if (fillable.isFull()) {
        //                 System.out.println("Filled " + fillable.getClass().getName());
        //             }
        //         }
        //     }
        // }
        // for (Fillable fillable : fillables) {
        //     if (!fillable.isFull()) {
        //         System.out.println("After 10,000 items, " +
        //             fillable.getClass().getName() + " is still hungry for more!");
        //     }
        // }
    }
}
