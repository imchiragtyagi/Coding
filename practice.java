import java.util.*;
import java.lang.*;
class practice
{
  public static void main(String[] args) {
    for (int i=0;i<11 ;i++ ) {
      
    
    System.out.println(fib(i));
  }
  }
  public static int fib(int n)
{
  return (int)((Math.pow(((1+Math.sqrt(5)) /2), n)-  Math.pow(((1-Math.sqrt(5)) /2), n))/Math.sqrt(5));
  }
}
  
    
  

  	

