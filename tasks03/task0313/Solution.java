package tasks03.task0313wip;

public class Solution {
    public static void main(String[] args){
        String[] list = new String[3];
        list[0] = ("мама");
        list[1] = ("мыла");
        list[2] = ("раму");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j<3; j++){
                for (int k = 0; k<3; k++){
                    if ((i != j)&&(j!=k)&&(i!=k) ) System.out.println(list[i]+list[j]+list[k]);
                }

            }
        }

    }
}
