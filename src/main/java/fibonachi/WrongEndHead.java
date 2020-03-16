package fibonachi;

import java.util.Arrays;
import java.util.Collection;

public class WrongEndHead {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fixTheMeerkat(new String[]{"c", "b", "a"})));
    }
    private static String[] fixTheMeerkat(String[] arr) {
        String s = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = s;
        return arr;
    }
}