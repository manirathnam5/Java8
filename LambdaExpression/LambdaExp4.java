package LambdaExpression;


public class LambdaExp4 {

    public static void main(String[] arg) {
        // Before lambda function
        Calculator calc = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        //Interface implementation using Lambda function

        Calculator lambda = (a,b )-> a+b;

        int result = lambda.operate(32, 34);

        System.out.println(result);
    }
}


interface Calculator {

    int operate(int a, int b);
}
