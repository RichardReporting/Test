package The_Required_Tasks.Lvl6.Array.diff;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 2, 6, 4, 23, 2, 3, 1, 1, 1, 1, 1};
        int[] b = {1, 2, 2, 1};
        b = arrayDiffer(a, b);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    public static int[] arrayDiffer(int[] a, int[] b) {
        List<Integer> listA = IntStream.of( a ).boxed().collect( Collectors.toList());
        List<Integer> listB = IntStream.of( b ).boxed().collect( Collectors.toList());
        listA.removeAll(listB);
        int[] c = new int[listA.size()];
        for (int i = 0; i < c.length; i++) {
            c[i] = listA.get(i);
        }
        return c;
    }
}
