package LambdaExpression;



public class ThreadExample {

    static void main() {


        Runnable  runnable = () -> {
            System.out.println("Server is running in EC2 ...");
        };

       Thread thread = new Thread(runnable);
       thread.start();


    }

}
