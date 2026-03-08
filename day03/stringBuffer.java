

//string --> immutable + thread safe                       
//stringBuilder --> mutable without thread safety 
//stringBuffer --> mutable with thread safety


public class stringBuffer {
   
  public static void main(String[] args) {
  
    StringBuffer string = new StringBuffer("hello");
    StringBuffer str = string.append("ji");
    System.out.println(str==string);

    String string1 = new String("hello");
    String string2 = string1+"ji";
    System.out.println(string1==string2);

    StringBuilder stringbuilder = new StringBuilder("genie Aswani");
    StringBuilder stringBuilder2 = stringbuilder.append("string ");
    System.out.println(stringbuilder == stringBuilder2);

   
  }    
}
