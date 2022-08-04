package HashMapPractice;

public class HasMapDemo {
    static int value =  345;
    static{
        System.out.println("Hi...");
    }
    static String staStr = "Static variable";

    static void disp(){
        System.out.println("Var1 is: ");
        System.out.println("Var2 is: ");

    }

    public static void main(String[] args){
        HasMapDemo hmp = new HasMapDemo();
        //System.out.println(" "+hmp);

        int arg =hmp.setValue();
        System.out.println(arg);
    }
    public static int setValue(){
        int intVal=20;
        System.out.println(value);
        disp();
        System.out.println(staStr);
        return intVal;
    }

}
