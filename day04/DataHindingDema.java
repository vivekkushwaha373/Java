/*
Data Hiding vs Abtraction

--> data hiding works on preventing the access of properties/methods
--> data abstraction means to hide the internal functionality of methods 

 */

class ATM{

    private String userName;
    private String pass;
    private int bal;

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getPass(){
        return pass;
    }

    public void setPass(String pass){
        this.pass = pass;
    }

    public int getBal(){
        return bal;
    }

    public void setBal(int bal){
        this.bal = bal;
    }

}

 

public class DataHindingDema {
    public static void main(String[] args) {
        
        ATM atm = new ATM();
        atm.setBal(34);
        System.out.println(atm.getBal());
    }

}
