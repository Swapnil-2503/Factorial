import java.util.*;
class Factorial1{
    
    public int Fact(int a){
     if(a>1){
     return a*Fact(a-1);}
     else{
         return 1;
     }
    }
}
public class Factorial {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n =sc.nextInt();
       Factorial1 fct=new Factorial1();
       System.out.println(fct.Fact(n));

    }
}
