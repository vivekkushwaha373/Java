package day11;

// import java.util.Map;
import java.util.*;

public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.MONDAY, "Gym");
        map.put(Day.TUESDAY, "sport");
        System.out.println(Day.TUESDAY.ordinal());
        
        // it mantians array of size same as enum [_,"Gym",_,_,_,_,_] 
        // ordinal/index is used
        // No hashing implemented here
        // printing order will be same as enum order




 
    }
}


enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}