package The_Required_Tasks.VowelCount;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        int count = 0;
        for(String ch : str.split("")) {
            if("aeuioAEUIO".contains(ch)) {
                count++;
            }
        }

        System.out.print(count);

    }
}
