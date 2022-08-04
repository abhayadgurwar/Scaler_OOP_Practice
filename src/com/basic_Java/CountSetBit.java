public class CountSetBit {

    public static void main(String[] args) {
        int n = 10;
        int i = 3;
        int setorNot1 = CountChekBits1(n, i);

        System.out.println(setorNot1);

      //  int setorNot2 = CountChekBits1(n, i);

        //System.out.println(setorNot2);

    }

    public static int CountChekBits1(int n, int i) {
        boolean bol = true;
        byte m = (byte) n;

        int cnt =  0;
        while(m>0){
            if( (m&1)  == 1 ){
                cnt++;
            }
            m = (byte) (m>>1);
        }

        return cnt;
    }


}
