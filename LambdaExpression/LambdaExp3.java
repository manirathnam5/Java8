 interface  NumericTest{
      
       boolean  test(int a , int b); 
 }
        
       

class LambdaExp3{

   public static void main(String[] arg){

      NumericTest  t = (a, b) ->  (a/b) == 0;

    if(t.test(12,3))
      System.out.println("Not a factor ");
    else
      System.out.println("Is a factor");

   }
}
 