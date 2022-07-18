package tasks08.task0814;

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) {
        HashSet<Integer> iSet = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            iSet.add(i );
        }

        iSet = setRemover(iSet);

        Iterator it = iSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static HashSet<Integer> setRemover(HashSet<Integer> iSet){
        Iterator<Integer> it = iSet.iterator();
        while (it.hasNext()) {
            if (it.next() > 10) it.remove();
        }
        return iSet;
    }

}
