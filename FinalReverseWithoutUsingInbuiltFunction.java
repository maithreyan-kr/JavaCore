package testing;

import java.util.Scanner;

public class FinalReverseWithoutUsingInbuiltFunction {
	
	public static void main(String[] args) {
        String str = "Saket Saurav";
//      converted to character array and printed in reverse order
        char chars[] = str.toCharArray();  
        for(int i= chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);
        }
        
//      This is another method in which you are declaring your string variable stri and then using 		Scanner class to declare an object with a predefined standard input object.
        String stri;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your String");
        stri = in.nextLine();
        String[] token = stri.split("");   
        
//      used split method to print in reverse order
        for(int i=token.length-1; i>=0; i--)
        {
            System.out.print(token[i] + "");
        }
        
        String original, reverse = "";
        System.out.println("Enter the string to be reversed");
        original = in.nextLine();
        int length = original.length();
        for(int i=length-1; i>=0; i--) {
//        	used inbuilt method charAt() to reverse the string
            reverse = reverse + original.charAt(i);   
        }
        System.out.println(reverse);
    }
	

}
