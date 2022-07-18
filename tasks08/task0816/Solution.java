package tasks08.task0816;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws ParseException {
        HashMap<String, Date> hDate = new HashMap<>();

        hDate.put("S1", dateParser("29.07.2000"));
        hDate.put("S2", dateParser("29.01.2000"));
        hDate.put("S3", dateParser("15.05.1988"));
        hDate.put("S4", dateParser("20.04.1964"));
        hDate.put("S5", dateParser("26.04.1986"));
        hDate.put("S6", dateParser("11.08.2010"));
        hDate.put("S7", dateParser("18.06.2000"));
        hDate.put("S8", dateParser("09.01.2001"));
        hDate.put("S9", dateParser("25.08.2004"));
        hDate.put("S10", dateParser("05.01.2000"));
        summerRemover(hDate);
    }

    public static Date dateParser(String strToDate) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("d.MM.yyyy");
        Date date = format.parse(strToDate);
        return date;
    }

    public static void summerRemover(HashMap<String, Date> hDate) {
        Iterator<HashMap.Entry<String, Date>> it = hDate.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Date> entry = it.next();
            if ((entry.getValue().getMonth() > 4) && (entry.getValue().getMonth() < 8)) it.remove();
        }
        for (String key: hDate.keySet()) {
            System.out.println(key+" "+ hDate.get(key));
        }


    }
}


