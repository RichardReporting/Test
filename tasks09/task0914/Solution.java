package tasks09.task0914;

public class Solution {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception3 e) {
            e.printStackTrace();
        } catch (Exception2 e) {
            e.printStackTrace();
        } catch (Exception1 e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws Exception1, Exception2, Exception3 {
    }

    class Exception1 extends Exception {
    }

    class Exception2 extends Exception1 {
    }

    class Exception3 extends Exception2 {
    }
}
