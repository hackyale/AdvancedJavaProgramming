public class InsertionSort {
    public static void main(String[] args) {
        int[] array = { 4, 5, 2, 1, 7, 0, 9, 3, 6, 8 };
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int carry = array[i];
            for (int j = 0; j < i; j++) {
                if (carry < sortedArray[j]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = carry;
                    carry = temp;
                }
            }
            sortedArray[i] = carry;
        }
        // print the array
        System.out.print("{ ");
        for (int x : sortedArray) {
            System.out.print(x + " ");
        }
        System.out.println("}");
    }
}
