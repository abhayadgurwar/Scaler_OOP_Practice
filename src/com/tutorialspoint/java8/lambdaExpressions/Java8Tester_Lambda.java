package com.tutorialspoint.java8.lambdaExpressions;

public class Java8Tester_Lambda {
    public static void main(String[] args) {
        Java8Tester_Lambda testerLambda = new Java8Tester_Lambda();

        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (a , b) -> a - b;
        MathOperation multiplication  = (int a, int b) -> {return a * b; };
        MathOperation division = (int a, int b) -> a/b;

        System.out.println("10 + 5 = " + testerLambda.operate(10, 5, addition));
        System.out.println("10 - 5 = " + testerLambda.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + testerLambda.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + testerLambda.operate(10, 5, division));

        GreetingService greetingService1 = message ->
                System.out.println("Hello " + message);
        GreetingService greetingService2 =  (message) ->
                System.out.println("Hello " + message);

        greetingService1.sayMessage("Abhay");
        greetingService2.sayMessage("Sheetal");

    }

    interface MathOperation{
        int operation(int a, int b);
    }
    interface GreetingService{
        void sayMessage(String message);
    }
    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
