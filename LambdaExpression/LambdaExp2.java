import java.util.*; 

  class LambdaExp2{

   public static void main(String[] arg){


      ArrayList<Integer>    list = new  ArrayList<Integer>();

     list.add(21);
     list.add(10);
     list.add(30);
    list.add(2);
    list.add(3);
    list.add(6);
    list.add(5);
    list.add(29);


    list.forEach( s-> System.out.println(s));
 
   System.out.println("Printing even numbers");
   list.forEach( n -> {

          if( n%2 ==0)
             System.out.println(n);
          } );
  }
}

  