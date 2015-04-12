/**
 * Represents a node in a singly-linked list
 */

public class Node<E> {
    E value; // value of this node
    Node<E> next; // next node in the list

    public Node(E value) {
        this.value = value;
    }

    public String toString() {
        return "(" + value + ")" + ((next == null) ? "" : " -> " + next);
    }
}
