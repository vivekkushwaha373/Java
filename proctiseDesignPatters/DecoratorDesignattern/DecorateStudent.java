package DecoratorDesignattern;

public class DecorateStudent implements Credentials{
    public Credentials credentials;
    public DecorateStudent(Credentials credentials){
       this.credentials = credentials;
    }
   
    
    public String getName(){
        return credentials.getName()+" Laudu hai ";
    }

    public Long getMobileNumber(){
        System.out.println("Yel le vivek uske bf ka number");
        return 8881159113L;
    }

}
