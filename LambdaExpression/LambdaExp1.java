 interface  DemoFunctionInterface{

     abstract void  print(int x);

    default void normalMsg(){
        System.out.println("Hello Welcome");
      }

    }
class LambdaExp1 {

  public static void main(String[] arg){

     DemoFunctionInterface   f =  (x ) -> System.out.println(x);

     f.print(100);

     //void comparator();


      
  }
}