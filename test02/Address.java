package test02;

public class Address{
    public String name;
    public Integer pincode;
    Address(String name,Integer pincode){
        this.name = name;
        this.pincode = pincode;
    }

   public String getName(){
        return name;
    }

    public Integer getpincode(){
        return pincode;
    }

    @Override
    public String toString(){
        return "{ Address = name: "+name+" and pincode: "+pincode+"}";
    }
}
