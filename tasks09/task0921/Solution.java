package tasks09.task0921;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution inputSol = new Solution();
        String input = "5 3 6 4 e 2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        //
        Scanner s = new Scanner(System.in);
        //
        int n = 0;
        ArrayList<Integer> listOfInput = new ArrayList<>();
        readData(s, n, listOfInput);


    }

    public static void readData(Scanner s, Integer n, ArrayList<Integer> listOfInput) {
        try {
            while (true) {
                int buff = s.nextInt();
                n += buff;
                listOfInput.add(buff);
            }
        } catch (InputMismatchException e) {

        }
        finally {
            for (int i = 0; i < listOfInput.size(); i++){
                System.out.println(listOfInput.get(i));
            }
            System.out.print(n);
            return;
        }

    }

}
