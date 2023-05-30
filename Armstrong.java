package testing;

public class Armstrong {
//	First of all we need to understand what Armstrong Number is. 
//	Armstrong number is the number which is the sum of the cubes of all its unit, 
//	tens and hundred digits for three-digit numbers.
//	153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
//	If you have a four-digit number lets say
//	1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1 + 1296 + 81 + 256 = 1634
	
	public static void main(String[] args)  {  
		   int c=0,a,temp;  
		   int n=153;//It is the number to check Armstrong  
		   temp=n;  
		   while(n>0)  
		   {  
		   a=n%10;  
		   n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else 
		        System.out.println("Not armstrong number");   
		   }  

}
