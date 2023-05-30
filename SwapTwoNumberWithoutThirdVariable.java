package testing;

import java.util.Scanner;

public class SwapTwoNumberWithoutThirdVariable {
	
	public static void main(String args[])
	   {
	      int x, y;
	      
	      System.out.println("Enter x and y");
	      Scanner in = new Scanner(System.in);
	  
	      x = in.nextInt();
	      y = in.nextInt();
	  
	      System.out.println("Before Swapping = " + x +" = " + y);
	  
	      x = x + y;
	      y = x - y;
	      x = x - y;
	  
	      System.out.println("After Swapping without third variable = " + x + " = " + y);
	      
	   }

}