package test02;
// final means the class cannot be inherited

final public class ImmutableClass {
    
    // properties
    private final String name;
    private final Integer age;
    private final Address address;
    
    // methods
    public ImmutableClass(String name,Integer age, Address address){
        this.name =name;
        this.age = age;
        this.address = address;
    }
   
    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }
    public Address getAddress(){
        return new Address(address.name, address.pincode);
    }

} 
