import java.util.ArrayList;
import java.util.List;

public class ListPrinter {
    public static <E> void printList(List<E> list) {
        for (E elem : list) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jenny");
        list.add("I'll");
        list.add("call");
        list.add("your");
        list.add("number");
        printList(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(6);
        list2.add(7);
        list2.add(5);
        list2.add(3);
        list2.add(0);
        list2.add(9);
        printList(list2);

    }
}
