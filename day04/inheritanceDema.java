class dumyclass{

    int a =3;
 
    void helloji(){
        System.out.println("Hello ji kya haal chal apke");
    }

}

class realclass extends dumyclass{

}

public class inheritanceDema {
    public static void main(String [] args){
       realclass rc = new realclass();
       rc.helloji();
       System.out.println(rc.a);
    }
}
