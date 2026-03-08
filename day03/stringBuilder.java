package day03;
/*
 *  STRING IS IMMUTABLE 
 *  Whenever it chages its value new string literal is allocated to heap which takes some time
 *  i.e. --> str ="vi" str+='i'  viv is allocated to heap again and str ref wil change from vi to viv and vi will gets deletd
 *  to Solve this problem we come up with string builder which make chnages in the same memory area
 *  method are setCharAt, insertAt, append, delete, length
 */

public class stringBuilder {
    
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("vivek");
        str.append('s'); //apend method
        System.out.println(str);
        str.insert(5, 'i'); //insert methos
        System.out.println(str); 
        str.setCharAt(0,'i' );
        System.out.println(str); //
        str.delete(0,2);
        System.out.println(str); //


    }


}
