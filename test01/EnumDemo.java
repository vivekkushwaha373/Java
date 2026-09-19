package test01;

enum SCHOOL{
    RAMPUS,
    SDACADEMY,
    LITTLEFLOWER;
}

record STUDENT(
   String name;
   Integer rollno;
){

}

class EnumDemo{
    public static void main(String[] args) {
        // here name and ordinal is given by ENUM
          SCHOOL sc = SCHOOL.RAMPUS;
         System.out.println(sc.name());
         System.out.println(sc.ordinal());

         // given at run time by the compiler

         // values
         for(SCHOOL e : sc.values()){
           System.out.println(e.name()); 
         }   
         //valuesof
         System.out.println(sc.valueOf("RAMPUS"));
    }
}

// compiler generated code

// class SCHOOL extends Enum{
//     public private final static RAMPUS = new SCHOOL("SCHOOL",1);
//     public private final static SDACADEMY = new SCHOOL("SDACADEMY",2);
//     public private final static LITTLEFLOWER = new SCHOOL("LITTLEFLOWER",3);

//     private SCHOOL(String name,int ordinal){
//         super(name,ordinal);
//     }


// }