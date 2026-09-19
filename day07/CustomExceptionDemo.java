package day07;

public class CustomExceptionDemo extends Exception{
  public CustomExceptionDemo(String msg){
      // super() --> this is done by compiler bydefault
      this.customMessage = msg;
  }  
  private String customMessage;
  public String getCustomErrorMessage(){
    //    System.out.println(customMessage);
       return customMessage;
  }    
}
