package The_Required_Tasks.OOP.CollectionFilter;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Integer[] arrayInt = new Integer[10];
        for (int i = 0; i < 10; i++) {
            arrayInt[i] = i;
        }
        var filterOfArr = filter(arrayInt, obj -> !obj.equals(2));
        for (var i : filterOfArr) {
            System.out.println(i);
        }
    }

    public static Object[] filter(Object[] array, Filter filter) {
        List<Object> answer = new ArrayList<>();
        for (var now : array) {
            if (filter.apply(now)) {
                answer.add(now);
            }
        }
        return answer.toArray();
    }
}
