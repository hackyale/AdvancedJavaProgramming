import java.util.List;
import java.util.ArrayList;

public class ListHelper1 {
    
    public interface MapFunction<A, B> {
        public B apply(A input);
    }

    public static <A, B> List<B> map(List<A> list, MapFunction<A, B> func) {
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

        List<Integer> lengths = map(words, new MapFunction<String, Integer>() {
            public Integer apply(String str) {
                return str.length();
            }
        });

        // print out lengths 5, 7, 2
        for (int length : lengths) {
            System.out.println(length);
        }
    }
}
