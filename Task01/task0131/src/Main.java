import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(getMetreFromCentimetre(n));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        return(centimetre / 100);
    }
}