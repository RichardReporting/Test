package The_Required_Tasks.Lvl5.PickPeaks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Soluiton {
    public static void main(String[] args) {
        int[] a = {-4, -2, 8, 12, 11, 0, 4, 3, 6, -4, 19, 14, -5, 4, -5, 3, 13, 13, 11, -1, 9, -1, 16};
        pickPeaks(a);
    }

    public static HashMap<String, List<Integer>> pickPeaks(int[] arrayOfInts) {
        int marker;
        if (arrayOfInts[0] > arrayOfInts[1]) {
            marker = -1;
        } else {
            marker = 1;
        }

        final int intUniSize = arrayOfInts.length;
        int vBuffer = arrayOfInts[0];
        int iBuffer = 0;

        HashMap<Integer, Integer> mapOfValues = new HashMap<>();
        HashMap<String, List<Integer>> mapOfPicks = new HashMap<>();

        for (int i = 1; i < intUniSize - 1; i++) {
            System.out.println(marker + "[" + arrayOfInts[i] + "]");
            switch (marker) {
                case -1: {
                    if (arrayOfInts[i] < arrayOfInts[i + 1]) {
                        marker = 1;
                        mapOfValues.put(iBuffer, vBuffer);
                        System.out.println(marker + "---[" + iBuffer + "](" + vBuffer + ")");
                        break;
                    }
                    if (arrayOfInts[i] >= arrayOfInts[i + 1]) {
                        marker = -1;
                        break;
                    }

                }
                case 1: {
                    if (arrayOfInts[i] > arrayOfInts[i + 1]) {
                        marker = -1;
                        vBuffer = arrayOfInts[i];
                        iBuffer = i;
                        break;
                    }
                    if (arrayOfInts[i] < arrayOfInts[i + 1]) {
                        marker = 1;
                        break;
                    }

                    if (arrayOfInts[i] == arrayOfInts[i + 1]) {
                        marker = 2;
                        break;
                    }

                }
                case 2: {
                    if (arrayOfInts[i] > arrayOfInts[i + 1]) {
                        marker = -1;
                        vBuffer = arrayOfInts[i];
                        iBuffer = i;
                        break;
                    }

                    if (arrayOfInts[i] == arrayOfInts[i + 1]) {
                        marker = 2;
                        break;
                    }

                    if (arrayOfInts[i] < arrayOfInts[i + 1]) {
                        marker = 1;
                        break;
                    }

                }
            }

        }

        List<Integer> pos = new ArrayList<>(mapOfValues.keySet());
        List<Integer> pick = new ArrayList<>();
        Collections.sort(pos);

        for (var m : pos) {
            pick.add(mapOfValues.get(m));
        }
        mapOfPicks.put("pos", pos);
        mapOfPicks.put("peaks", pick);
        return mapOfPicks;
    }
}
