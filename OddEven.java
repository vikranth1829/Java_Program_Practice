package CodePractice;

import java.util.Scanner;
public class OddEven
{
    public static void main(String[] args)
    {
      
      int n;
      Scanner sc=new Scanner(System.in);
      
      n=sc.nextInt();
      
      
      													//Using If condition
      
    /*  if (n%2==0)
      	  System.out.println("Even Number");
      else
      	  System.out.println("Odd Number");
      
    */
      
      													//Using Ternary Operator
    	
    /*	String s=(n%2==0) ? "Even" : "Odd" ;      
    	System.out.println(" Entered Number is : "+s);
   	*/
      
      													//Bitwise Operator
      
    /*  if((n&1)==0)
      System.out.println("Even Number");
      else
      System.out.println("Odd Number");
     */
      
      
      													//Switch Case
      
     /*  switch(n%2)
      	{
    	  case 0 :
    		  System.out.println("Even Number");
    		  break;
    	  case 1:
    		  System.out.println("Odd Number");
    		  break;
      	}		  
      */
      
      												//  Array Lookup
      
    /*  String[] sr= {"Even","Odd"};
      
        System.out.println(n+ " is "+sr[(n%2)]);
     */ 
      
      
      
      
    }
  }    	
    
  	
    	
    

