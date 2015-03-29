public class ListReverse {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);
        reverse(n3);
        System.out.println(n7);
    }

    public static void reverse(Node node) {
        Node next = node.getNext();
        if (next != null) {
            reverse(next);
            next.setNext(node);
            node.setNext(null);
        }
    }
}

class Node {
    private int value;
    private Node next;
    
    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "(" + value + ")" + ((next != null) ? "->" + next : "");
    }
}
