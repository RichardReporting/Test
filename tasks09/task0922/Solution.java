package tasks09.task0922;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat sf1 = new SimpleDateFormat("MM/dd/yyyy");
        String date = s.nextLine();
        Date dateForm = sf1.parse(date);
        SimpleDateFormat sf2 = new SimpleDateFormat("MMM dd, yyyy");
        System.out.print(sf2.format(dateForm).toUpperCase(Locale.ROOT));

    }
}
