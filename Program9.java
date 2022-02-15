import java.util.*;
public class Program9 
{ 
    public static void main(String[] args) 
    { 
        List<Integer> al = new ArrayList<>(); 
        System.out.println("Enter size of arraylist:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m;
        System.out.println("Add elements in arraylist:");
        for(int i=0;i<n;i++)
        {
			m=sc.nextInt();
			al.add(m); 
		}
       
	    System.out.println("Enter index of element which you want to remove:");
	    int a=sc.nextInt();
        al.remove(a); 
  
        System.out.println("Modified ArrayList : " + al); 
    } 
} 
