import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TupleList {
    public static <A extends Comparable<A>, B extends Comparable<B>>
    void sortTupleList(List<Tuple2<A, B>> tupleList) {
        // local class that defines a new comparator used in this method
        class TupleComparator implements Comparator<Tuple2<A, B>> {
            public int compare(Tuple2<A, B> tuple1, Tuple2<A, B> tuple2) {
                int firstComp = tuple1.getFirst().compareTo(tuple2.getFirst());
                if (firstComp != 0) {
                    return firstComp;
                } else {
                    return tuple1.getSecond().compareTo(tuple2.getSecond());
                }
            }
        }
        tupleList.sort(new TupleComparator());
    }

    public static void main(String[] args) {
        List<Tuple2<Integer, String>> tupleList = new ArrayList<>();
        tupleList.add(new Tuple2<>(1, "hi"));
        tupleList.add(new Tuple2<>(1, "bye"));
        tupleList.add(new Tuple2<>(2, "hi"));
        tupleList.add(new Tuple2<>(2, "bye"));
        sortTupleList(tupleList);
        for (Tuple2<Integer, String> tuple : tupleList) {
            System.out.println(tuple);
        }
    }
}
