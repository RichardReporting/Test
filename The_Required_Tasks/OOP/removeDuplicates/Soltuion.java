package The_Required_Tasks.OOP.removeDuplicates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

public class Soltuion {

    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            testList.add(i);
            testList.add(i);
        }
        for (int i : removeDuplicates(testList)) {
            System.out.println(i);
        }
    }

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new LinkedHashSet<>() {{
            addAll(collection);
        }};
    }
}

