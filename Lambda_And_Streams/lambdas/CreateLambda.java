package lambdas;

public class CreateLambda {
    interface Greeting{
        public String sayHello(String a);
    }

    public void testGreeting(String a, Greeting g) {
        String result = g.sayHello(a);
        System.out.println("Result: " + result);

    }

    public static void main(String[] args) {

        new CreateLambda().testGreeting("Harry", (String s)->"Hello, " + s);

    }


}
