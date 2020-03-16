package fibonachi;

import java.util.ArrayList;
import java.util.Collections;

public class SquareDigit {
    public static void main(String[] args) {
        System.out.println(squareDigits(4487));
    }

    static int squareDigits(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n!=0){
            list.add((n % 10)*(n % 10));
            n /= 10;
        }
        Collections.reverse(list);
        StringBuilder str = new StringBuilder();
        for (Integer aList : list) {
            str.append(aList);
        }
        return Integer.valueOf(String.valueOf(str));
    }
}
