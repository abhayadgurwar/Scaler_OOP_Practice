import java.lang.Math;

public class CheckPrime {

    public static void main(String[] args) {
        boolean bol = isPrime3(7);
        System.out.println(bol);

    }

    public static boolean isPrime(int n) {
        for (int cnt = 2; cnt <= n - 1; cnt++) {
            if (n % cnt == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime2(int n) {
        for (int cnt = 2; cnt <= n / 2; cnt++) {
            if (n % cnt == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime3(int n) {
        for (int cnt = 2; cnt <= Math.sqrt(n); cnt++) {
            if (n % cnt == 0) {
                return false;
            }
        }
        return true;
    }
}
