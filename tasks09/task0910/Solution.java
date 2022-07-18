package tasks09.task0910;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException s) {
            System.out.print("IndexOutOfBoundsException");
        }
    }
}
