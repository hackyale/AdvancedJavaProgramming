package foo;

import bar.Bar;

public class Foo {
    public static void main(String[] args) {
        Xyzzy x = new Xyzzy(7);
        x.setBaz(10);
        System.out.println(x.getBaz());
    }
}
