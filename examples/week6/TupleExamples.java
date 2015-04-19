import java.util.List;
import java.util.ArrayList;

public class TupleExamples { 
    public static void main(String[] args) {
        int[] arr = { 8, 6, 7, 5, 3, 0, 9 };
        Tuple2<Integer, Integer> maxAndMin = getLargestAndSmallest(arr);
        System.out.println("Max: " + maxAndMin.getFirst());
        System.out.println("Min: " + maxAndMin.getSecond());
    

        List<String> list1 = new ArrayList<>();
        list1.add("alpha");
        list1.add("beta");
        list1.add("gamma");
        List<String> list2 = new ArrayList<>();
        list2.add("gamma");
        list2.add("delta");
        Tuple2<Integer, String> commonElem = getCommonElement(list1, list2);
        if (commonElem.getFirst() == null) {
            System.out.println("Lists do not intersect.");
        } else {
            int index = commonElem.getFirst();
            String elem = commonElem.getSecond();
            System.out.println("Found common element [" + elem + "] at index " + index);
        }
    }

    public static Tuple2<Integer, Integer> getLargestAndSmallest(int[] arr) {
        if (arr == null) {
            return null;
        } else if (arr.length == 0) {
            return new Tuple2<>(null, null);
        } else {
            int smallest = arr[0];
            int largest = arr[0];
            for (int i : arr) {
                if (smallest > i) {
                    smallest = i;
                } else if (largest < i) {
                    largest = i;
                }
            }
            return new Tuple2<>(largest, smallest);
        }
    }

    public static <E> Tuple2<Integer, E> getCommonElement(List<E> list1, List<E> list2) {
        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                return new Tuple2<>(i, list1.get(i));
            }
        }
        return new Tuple2<>(null, null);
    }
}
