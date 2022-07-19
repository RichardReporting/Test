package tasks09.task0918;

import java.io.FileNotFoundException;
import java.net.SocketException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends FileNotFoundException {
    }

    static class MyException2 extends SocketException {
    }

    static class MyException3 extends NullPointerException{
    }

    static class MyException4 extends ArrayIndexOutOfBoundsException{
    }
}
