package practiset01;

public enum Day{
    
    MONDAY("MONDAY"){
       @Override
       public String DAY(){
        return "MONDAY";
       }
    },
    
    TUESDAY("TUESDAY"){
      @Override
       public String DAY(){
        return "MONDAY";
       }
    },
    
    WEDNESDAY("WEDNESDAY"){
       @Override
       public String DAY(){
        return "MONDAY";
       }
    };

    String name;
    Day(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    static String ListDays(){
        return "MON, TUE, WED, THU, FRI, SAT, SUN";
    }


    public abstract String DAY();


}

public class javapractise18 {
  public static void main(String[] args) {
     Day monday = Day.MONDAY;
     Day tuesday = Day.TUESDAY;
    //  Day wednesday = Day.WEDNESDAY;


     System.out.println(monday);
     System.out.println(monday.name());
     Day wednesday = Day.valueOf("WEDNESDAY");
     System.out.println(wednesday);
     monday.setName("FRIDAY");
     System.out.println(monday.name);
     System.out.println(monday.ordinal());
     System.out.println(monday.name());
     System.out.println(Day.ListDays());



  }
}
