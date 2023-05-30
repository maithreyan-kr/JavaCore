package testing;

public class StringTest {
	
	 public static void main(String[] args) {
         // TODO Auto-generated method stub
         java.lang.String str = "Automation";
         StringBuilder str2 = new StringBuilder();
         str2.append(str);
         str2 = str2.reverse();     // used string builder to reverse
        System.out.println(str2);
         }

}
