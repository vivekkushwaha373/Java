// lambda expression
// lambda expression is an anonymous fucntion (no name, no retun type, no access modifier)

// lambda function implements functional interface

// functional interace = interface with only one abstract method

public class lambdaExpressionDemo{
    public static void main(String[] args) {
       MathOperator pb = (a,b)->a+b; // this line create a class to implement MathOperator interface 
        int res = pb.operator(2,3); 
        System.out.println(res);        
    }
}
@FunctionalInterface // compiler check
interface MathOperator{
    int operator(int a,int b);
}