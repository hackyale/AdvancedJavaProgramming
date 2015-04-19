import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class ListHelper2 {

    // Note: Java 8 already provides map, but here's a possible implementation
    public static <A, B> List<B> map(List<A> list, Function<A, B> func) {
        List<B> mappedList = new ArrayList<>();
        for (A elem : list) {
            mappedList.add(func.apply(elem));
        }
        return mappedList;
    }


    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("goodbye");
        words.add("hi");

        List<Integer> lengths = map(words, str -> str.length());

        // print out lengths 5, 7, 2
        lengths.forEach(System.out::println);
    }
}
