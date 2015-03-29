public class List {
    private Node top;
    private int size;

    public void append(int value) {
        insert(size, value);
    }

    public void insert(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("" + index);
        } else {
            Node newNode = new Node(value);
            if (index == 0) {
                newNode.next = top;
                top = newNode;
            } else {
                Node prevNode = top;
                for (int i = 0; i < index - 1; i++) {
                    prevNode = prevNode.next;
                }
                newNode.next = prevNode.next;
                prevNode.next = newNode;
            }
            size++;
            System.out.println("Inserted " + value + " at index " + index);
        }
    }

    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("" + index);
        } else {
            int value;
            if (index == 0) {
                value = top.value;
                top = top.next;
            } else {
                Node prevNode = top;
                for (int i = 0; i < index - 1; i++) {
                    prevNode = prevNode.next;
                }
                value = prevNode.next.value;
                prevNode.next = prevNode.next.next;
            }
            size--;
            System.out.println("Removed " + value + " from index " + index);
            return value;
        }
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("" + index);
        } else {
            Node node = top;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node.value;
        }
    }

    public int size() {
        return size;
    }

    public String toString() {
        return ((top == null) ? "[EMPTY]" : top.toString());
    }

    public static void main(String[] args) {
        // example usage
        List list = new List();
        list.append(1);
        list.append(2);
        list.append(4);
        list.insert(2, 3);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove(0);
        list.remove(1);
        list.remove(0);
    }
}
