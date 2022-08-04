package The_Required_Tasks.Lvl5.WeightForWeight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

    }

    public static String sortFFC(String stringOfWeights) {
        String[] arrayStrWeights = stringOfWeights.split(" ");
        String strResult = "";
        HashMap<Long, ArrayList<String>> mapOfWeights = new HashMap<>();
        for (String varArrayStrWeight : arrayStrWeights) {
            long longWeight = 0;
            long buffer = Long.parseLong(varArrayStrWeight);
            while (buffer > 0) {
                longWeight += buffer % 10;
                buffer /= 10;
            }
            if (!mapOfWeights.containsKey(longWeight)) {
                mapOfWeights.put(longWeight, new ArrayList<>());
            }
            mapOfWeights.get(longWeight).add(varArrayStrWeight);
        }
        System.out.println(mapOfWeights);

        ArrayList<Long> listOfKeys = new ArrayList<>(mapOfWeights.keySet());
        Collections.sort(listOfKeys);

        for (Long key : listOfKeys) {
            Collections.sort(mapOfWeights.get(key));
            strResult = strResult + " " + String.join(", ", mapOfWeights.get(key));
        }
        return strResult;
    }
}


//        Arrays.sort(arrayStrWeights);