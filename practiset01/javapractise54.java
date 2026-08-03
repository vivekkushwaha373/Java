package practiset01;

// we introduced optional to avoid Null Check Hell
// optional class is wrapper over Object

//creating optionals

// Optional<String> n = Optional.of("Aditya");
// Optional<String> n = Optional.ofNullable("Aditya or nULL")
// if want to return Null only use Optional.isEmpty();
// It has isPresent() gives boolean or ifPresent() which acccepts consumer
// get() risky if null
// orElse("name") // check even if value present
// orElseGet(()->"unknown") // do not check if value present
// orElseThrow() // to throw NoSuchElement Exception
// ifPresentorElse(consumer,consumer) // 


import java.util.Optional;

public class javapractise54 {
    public static void main(String[] args) {
        Optional<String> name = Optional.empty();
        // if (name.isPresent()) {
        //     System.out.println(name.get());
        // }

        // name.ifPresent(System.out::println);
        System.out.println(name.orElse("Undefined")); // it gives resolved value
        // name.orElseThrow();
        System.out.println(name.orElseGet(()->"Undefined"));

        name.ifPresentOrElse(System.out::println, ()->System.out.println("Not present"));


    }
}
