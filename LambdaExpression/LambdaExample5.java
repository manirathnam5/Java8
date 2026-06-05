package LambdaExpression;


   interface  Addition{
       public abstract void add(int i , int j)  ;
   }


   /*class DemoAdd implements Addition{

       @Override
       public void add(int i, int j) {
           System.out.println("Addition of two numbers "+(i+j));
       }
   }*/


public class LambdaExample5 {



    public static void main(String[] arg){

        Addition obj = (i , j)-> System.out.println("addition of two numbers : "+( i+j));

        obj.add(5,4);
    }

}
