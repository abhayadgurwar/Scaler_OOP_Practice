public class CheckBit {

    public static void main(String[] args) {
        int n = 10;
        int i = 3;
        boolean setorNot1 = chekBits1(n, i);
        System.out.println(setorNot1);

        boolean setorNot2 = chekBits1(n, i);
        System.out.println(setorNot2);
    }


    public static boolean chekBits1(int n, int i) {
        boolean bol;
        byte m = (byte) n;

    if( ((m >> i)&1 ) == 1)
        return true;
    return false;
    }

    public static boolean chekBits2(int n, int i) {
        boolean bol;
        byte m = (byte) n;

        if ((((m & (1 << i)) >> i) & 1) == 1)
            return true;
        return false;

    }
}

