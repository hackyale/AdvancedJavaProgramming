public class InsertionSort2 {
    public static void main(String[] args) {
        int[] array = { 4, 5, 2, 1, 7, 0, 9, 3, 6, 8 };
        for (int i = 0; i < array.length; i++) {
            int carry = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j+1];
                if (j >= array.length - i - 1 && carry < array[j]) {
                    int temp = array[j];
                    array[j] = carry;
                    carry = temp;
                }
            }
            array[array.length-1] = carry;
        }
        // print the array
        System.out.print("{ ");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println("}");
    }
}

