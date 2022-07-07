package tasks03.task0307;

public class Solution {
    public static void main(String[] args) {
        String[] zerg[] = new String[10][5];
        String[] protoss[] = new String[6][7];
        String[] terran[] = new String[15][7];

        for (int i = 0; i<10; i++){
            zerg[i][0] = ("Zerg"+(i+1));
            System.out.println(zerg[i][0]);
        }
        for (int i = 0; i<6; i++){
            protoss[i][0] =("Protoss"+(i+1));
            System.out.println(protoss[i][0]);
        }
        for (int i = 0; i<15; i++){
            terran[i][0] = ("Terran"+(i+1));
            System.out.println(terran[i][0]);
        }
    }
}

