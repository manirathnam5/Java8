import java.util.Arrays;
import java.util.List;

class Java8Example{


/*

   //static
    void printElement(int i){

      System.out.println(i);
        Java8Example
   }
*/


    public static void main(String[] arg){

    Java8Example    obj = new Java8Example();

    List<Integer>  list = Arrays.asList(5,4,7,3,8,12,13,14,11,23,10);

    list.stream().filter(a-> a >= 6).sorted().forEach(obj::printElement);
        
    }
}