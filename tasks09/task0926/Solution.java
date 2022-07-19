package tasks09.task0926;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[2];
        int[] array3 = new int[4];
        int[] array4 = new int[7];
        int[] array5 = new int[0];
        for (int i = 0; i < array1.length; i++){
            array1[i] = i;
        }
        for (int i = 0; i < array2.length; i++){
            array2[i] = i;
        }
        for (int i = 0; i < array3.length; i++){
            array3[i] = i;
        }
        for (int i = 0; i < array4.length; i++){
            array4[i] = i;
        }
        for (int i = 0; i < array5.length; i++){
            array5[i] = i;
        }
        ArrayList<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(array1);
        listOfArrays.add(array2);
        listOfArrays.add(array3);
        listOfArrays.add(array4);
        listOfArrays.add(array5);

        for (int i = 0; i < listOfArrays.size(); i++){
            int[] jArray = listOfArrays.get(i);
            for (int j = 0; j < jArray.length; j++){
                System.out.print(jArray[j]+" ");
            }
            System.out.println();
        }
    }

}
