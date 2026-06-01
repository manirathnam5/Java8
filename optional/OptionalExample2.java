package optional;

import java.util.Optional;

public class OptionalExample2 {

    public static void main(String[] arg){

        Optional<String>  optional = Optional.ofNullable("manish");

        Optional<String>  of = Optional.of("mmr");

        System.out.println(optional.isPresent() ? optional.get()  : optional.empty() );


         System.out.println(optional.isPresent() ? of.get()  : of.empty() );

        //System.out.println(optional.get());



    }
}
