package The_Required_Tasks.OOP.MyLinkedList;

public class Solution {
    public static void main(String[] args) {
//        LinkedList basedList = new LinkedList();
//        System.out.println(basedList.iterator());
        SomeClass list = new SomeClass();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println(list.toArray());

    }
}
