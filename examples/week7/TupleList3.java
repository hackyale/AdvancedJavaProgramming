import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TupleList3 {
    public static <E> void sort(List<E> list, Comparator<E> comparator) {
        for (int t = 1; t <= list.size(); t++) {
            E elem = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (i < list.size() - t) {
                    list.set(i, list.get(i+1));
                } else if (i == list.size() - 1) {
                    list.set(i, elem);
                } else if (comparator.compare(list.get(i+1), elem) <= 0) {
                    list.set(i, list.get(i+1));
                } else {
                    list.set(i, elem);
                    elem = list.get(i+1);
                }
            }
        }
    }

    public static <A extends Comparable<A>, B extends Comparable<B>>
    void sortTupleList(List<Tuple2<A, B>> tupleList) {
        // local class that defines a new comparator used in this method
        sort(tupleList, new Comparator<Tuple2<A, B>>() {
            public int compare(Tuple2<A, B> tuple1, Tuple2<A, B> tuple2) {
                int firstComp = tuple1.getFirst().compareTo(tuple2.getFirst());
                if (firstComp != 0) {
                    return firstComp;
                } else {
                    return tuple1.getSecond().compareTo(tuple2.getSecond());
                }
            }
        });
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
