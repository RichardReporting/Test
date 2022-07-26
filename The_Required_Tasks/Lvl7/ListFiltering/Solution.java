package The_Required_Tasks.Lvl7.ListFiltering;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Object> listOfTypes = new ArrayList<>(Arrays.asList("1", 2, "33", "abc", 5, "6", 77));
        listOfTypes = listFilter(listOfTypes);
        for (var list : listOfTypes) {
            System.out.println(list);
        }
    }

    public static ArrayList<Object> listFilter(ArrayList<Object> listOfTypes) {
        for (int i = 0; i < listOfTypes.size(); i++) {
            if (listOfTypes.get(i) instanceof String) {
                listOfTypes.remove(i);
                i--;
            }
        }
        return listOfTypes;
    }
}
