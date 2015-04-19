import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TupleList4 {
    public static <A extends Comparable<A>, B extends Comparable<B>>
    void sortTupleList(List<Tuple2<A, B>> tupleList) {
        tupleList.sort((tuple1, tuple2) -> {
            int firstComp = tuple1.getFirst().compareTo(tuple2.getFirst());
            if (firstComp != 0) {
                return firstComp;
            } else {
                return tuple1.getSecond().compareTo(tuple2.getSecond());
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
        tupleList.forEach(System.out::println);
    }
}
