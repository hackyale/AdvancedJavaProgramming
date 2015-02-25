public class StringWrapper {
    private String wrapped;

    public StringWrapper(String wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String toString() {
        return wrapped;
    }

    public void spaceMe() {
        StringBuilder builder = new StringBuilder();
        for (char ch : wrapped.toCharArray()) {
            builder.append(ch + " ");
        }
        wrapped = builder.toString();
    }
}
