public class Queue {
    private Node front;
    private Node back;

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (front == null) {
            front = newNode;
            back = newNode;
        } else {
            back.next = newNode;
            back = newNode;
        }
        System.out.println("Enqueued " + value);
    }

    public int dequeue() {
        int value = front.value;
        front = front.next;
        System.out.println("Dequeued " + value);
        return value;
    }

    public int peek() {
        return front.value;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public String toString() {
        return "FRONT -> " + ((front == null) ? "[EMPTY]" : front.toString()) + " -> BACK";
    }

    public static void main(String[] args) {
        // example usage
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
    }
}
