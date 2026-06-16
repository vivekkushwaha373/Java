package classesdemo02;

import classesdemo01.CarModel;

class Car extends CarModel {

   void setCarType(int type) {
      cartype = type; // cartype protected and is it valid
   }

//    void setCarnumber(int num) {
//       carnumber = num; // carnumber is default // here it is wrong
//    }

   int getCartype02(){
       return getCartype();
   }

}
public class index {
    public static void main(String[] args) {
      Car car = new Car();
      car.setCarType(3);
      System.out.println(car.getCartype02()); //getcartype is default
    //   car.setCarnumber(3);
    //   System.out.println(car.cartype);

   }
}
