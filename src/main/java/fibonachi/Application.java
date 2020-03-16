package fibonachi;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        System.out.println(CountingDuplicates.duplicateCount("AaBBbbBB235662gGuy"));
    }


}
class CountingDuplicates {
  static int duplicateCount(String text) {
        int count =0;
        ArrayList<Character> list = new ArrayList<Character>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i=0; i<text.length(); i++) {
            list.add(text.toUpperCase().charAt(i));
        }
        for (int i=0; i<list.size(); i++) {
            map.put(list.get(i).toString(), Collections.frequency(list, list.get(i)) );
        }
        for (Map.Entry entry : map.entrySet()) {
            if ((Integer) entry.getValue() > 1)
                count++;
        }
        return count;
    }
}
