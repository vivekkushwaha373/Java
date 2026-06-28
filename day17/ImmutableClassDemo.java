package day17;

public class ImmutableClassDemo {
    public static void main(String[] args) {
       College col = new College("JNU",1);
       Primary ob = new Primary(1, "vivek",col);
       System.out.println(ob.getname());
       System.out.println(ob.getrollno());
       System.out.println(ob.getCollege().colledgename);
       ob.getCollege().colledgename= "LandRam college"; // this is a shallow copy
       System.out.println(ob.getCollege().colledgename);

    }
}
// lets make an immutable class
final class Primary{
    private final int rollno;
    private final String name;
    private final College col;
    Primary(int rollno, String name, College col){
        this.rollno = rollno;
        this.name = name;
        this.col = new College(col.colledgename, col.collegeid);
    }

    int getname(){
        return this.rollno;
    }

    String getrollno(){
        return this.name;
    }

    College getCollege(){
        // return this.col;
        return new College(col.colledgename, col.collegeid);
    }
} 


class College{
    String colledgename;
    int collegeid;
    College(String colleggename,int collegeid){
        this.colledgename=colleggename;
        this.collegeid=collegeid;
    }
}


// public class ImmutableClassDemo {
//     public static void main(String[] args) {
       
//         final Primary ob = new Primary("vivek",43);
//         ob.name="helloji";
//         System.out.println(ob.name);

//     }
// }

// class Primary{
//     String name;
//     int rollno;
//     // secondary sc;
//     Primary(String name,int rollno){
//         this.name=name;
//         this.rollno=rollno;
//         // this.secondary=secondary;
//     }

//     String getname(){
//         return name;
//     }

//     int getroll(){
//         return rollno;
//     }
    
// }

// class secondary{
    
// }