package day03;

public class stringconcatenination {
    public static void main(String[] args) {
        
        String firstName = "Dakait";
        String lastName = "Rahman";
        String fullName = firstName +" "+ lastName;
        //printing full Name of string
        System.out.println(fullName);
        //priting string length
        System.out.println(fullName.length());
        //charat
        System.out.println(fullName.charAt(0));  //fullName[0] is wrong

        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

    }
    
}
