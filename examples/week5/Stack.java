public class Stack {
    private Node top;

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed " + value);
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int pop() {
        int value = top.value;
        top = top.next;
        System.out.println("Popped " + value);
        return value;
    }

    public int peek() {
        return top.value;
    }

    @Override
    public String toString() {
        return "TOP -> " + ((top == null) ? "[EMPTY]" : top.toString());
    }

    public static void main(String[] args) {
        // example usage
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
}
