package day16;


enum Day{

    MONDAY("vivek"){
        @Override
        int random(int a){
            return a;
        }
    }, 
    TUESDAY("ravi"){
        @Override
        int random(int a){
            return a;
        }
    },
    FRIDAY("zoya"){
        @Override
        int random(int a){
            return a;
        }
    };
    
    String name;
    Day(String name){
      this.name=name;
    }

    abstract int random(int a);

}


public class enumsdemopractise {
    public static void main(String[] args) {
        Day ob = Day.MONDAY;
        System.out.println(ob.name);
        System.out.println(Day.valueOf("MONDAY"));
        System.out.println(Day.values());
        System.out.println(ob.name());
        System.out.println(ob.ordinal());
        System.out.println(ob.random(3));
    }   
}
