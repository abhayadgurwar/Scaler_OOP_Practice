public class FunctionsDemo {

    public static void main(String[] args) {

        func1();

        //add(3,5);

       int c =  add1(3,5);
       System.out.println(c);
    }


    public static void func1()
    {
        System.out.println("Hello Java..!!");
    }

    public static void add (int a, int b){
        int c =  a+b;
        System.out.println ("Addition: " + c);
    }

    public static int add1(int a, int b){

        return a+b;
    }
}
