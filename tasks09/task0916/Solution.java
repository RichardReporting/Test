package tasks09.task0916;

import java.io.IOException;
import java.rmi.RemoteException;

public class Solution {
    public static void main(String[] args) {
        processExceptions(new Solution());
    }

    public static void processExceptions(Solution obj) {
        try {
            obj.ioExceptionMethod();
            obj.noSuchFieldExceptionMethod();
            obj.remoteExceptionMethod();

        } catch (Exception e) {
            System.out.print(e);
        }
    }

    public void ioExceptionMethod() throws IOException {
        throw new IOException();
    }

    public void noSuchFieldExceptionMethod() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void remoteExceptionMethod() throws RemoteException {
        throw new RemoteException();
    }

}
