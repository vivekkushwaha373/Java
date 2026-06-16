package classesdemo01;

class Car extends CarModel {

   void setCarType(int type) {
      cartype = type;
   }

   void setCarnumber(int num) {
      carnumber = num;
   }

}

public class index {
   public static void main(String[] args) {
      Car car = new Car();
      car.setCarType(3);
      System.out.println(car.getCartype());
      car.setCarnumber(3);
      System.out.println(car.cartype);

   }
}
