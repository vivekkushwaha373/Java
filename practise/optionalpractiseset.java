package practise;

import java.util.Optional;

public class optionalpractiseset {
  public static void main(String[] args) {
    Optional<Integer> op = Optional.of(1);

    op.map(x->x+1).ifPresent(System.out::println);

    Optional<String> op2 = Optional.ofNullable("ADITYA");
    op2.map(x->x.length()).filter(len->len>0).ifPresent(x->System.out.println(x));


    Optional<String> op3 = Optional.ofNullable(null);

    System.out.println(op3.orElse("null aar aya"));
    System.out.println(op3.orElseGet(()->"NULL AA GAYA"));
    

  }    
}
