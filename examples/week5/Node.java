/**
 * Represents a node in a singly-linked list
 */

public class Node {
    int value; // value of this node
    Node next; // next node in the list

    public Node(int value) {
        this.value = value;
    }

    public String toString() {
        return "(" + value + ")" + ((next == null) ? "" : " -> " + next);
    }
}
