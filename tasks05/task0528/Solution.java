package tasks05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date dateNow = new Date();
        SimpleDateFormat formatDateNow = new SimpleDateFormat("dd.mm.yyyy");
        System.out.println(formatDateNow.format(dateNow));
    }
}
