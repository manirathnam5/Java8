import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

 // Program to print even numbers using Stream api

public class StreamExample1 {


  public static void main(String[] arg){

    ArrayList<Integer> list = new ArrayList<>();

    list.add(2);
    list.add(6);
    list.add(9);
    list.add(4);
    list.add(20);


    System.out.println("First lets print the collection "+ list) ;

    List<Integer> evenList = list.stream().filter(i->(i%2)==0 ).collect(Collectors.toList());

    System.out.println("Printing list after stream operation " + evenList) ;


  }

  }
