package The_Required_Tasks.Lvl5.PaginatorHelper;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
    }
}

class PaginationHelper {
    ArrayList listOfValues;
    int intPageSeparator;

    public PaginationHelper(ArrayList listOfValues, int intPageSeparator) {
        this.listOfValues = listOfValues;
        this.intPageSeparator = intPageSeparator;
    }

    public Integer pageCount() {
        return  (int)Math.ceil(listOfValues.size() / intPageSeparator);
    }

    public Integer itemCount() {
        return listOfValues.size();
    }

    public Integer pageItemCount(int intPageNumber) {
        if (intPageNumber > pageCount()) return -1;
        if (intPageNumber == pageCount()) return itemCount() % intPageSeparator;
        return intPageSeparator;
    }

    public Integer pageIndex(int intIndex) {
        if ((intIndex > itemCount()) || (intIndex < 0)) return -1;
        return itemCount() / intIndex -1 ;
    }
}
