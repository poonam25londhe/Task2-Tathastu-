import java.util.*;
public class Program7 {
  public static void main(String[] args) {
  
	System.out.println("Enter String which you want to reverse:");
    Scanner sc=new Scanner(System.in);
    String str = sc.next();
    String reversedString = "";
    
    for(int i = str.length()-1; i>=0; i--){
      reversedString = reversedString + str.charAt(i);
    }
    
    System.out.print("The reversed string of the '"+str+"' is: " );
    System.out.println(reversedString);
  }
}
