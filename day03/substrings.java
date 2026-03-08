package day03;

public class substrings {
  public static void main (String [] args){
     String sentence = "My name is Tony";
     //beginning index is inclusive
     //ending index is exclusive
     //if ending index is not given it goes up to entire length whoch is length()
     String name1 = sentence.substring(0, 4);
     String name2 = sentence.substring(4);
     System.out.println(name1);

  }  
} 
