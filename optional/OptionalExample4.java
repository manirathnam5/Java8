package optional;

import java.util.Optional;

public class OptionalExample4 {

    public static void main(String[] arg){

        Optional<String>  ofNullable = Optional.ofNullable("Java8");
        System.out.println(ofNullable.isPresent() ? ofNullable.get(): Optional.empty());
        ofNullable.ifPresent(i-> System.out.println(i));
    }

}
