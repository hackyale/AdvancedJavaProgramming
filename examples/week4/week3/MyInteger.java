public class MyInteger {
    private int x;

    public MyInteger(int x) {
        this.x = x;
    }

    public int intValue() {
        return x;
    }

    public MyInteger flipSign() {
        return new MyInteger(x * -1);
    }
}
