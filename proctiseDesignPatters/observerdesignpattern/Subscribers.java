package observerdesignpattern;

public class Subscribers {
    public String name;
    public String email;
    public Subscribers(String name,String email){
         this.name = name;
         this.email = email;
    }
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

}
