import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        StringWrapper wrapper = new StringWrapper("Hello, world!");
        wrapper.spaceMe();
        System.out.println(wrapper);
    }
}
