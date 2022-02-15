import java.util.*;
public class Program8 {

	static boolean isMirrorInverse(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {

			if (arr[arr[i]] != i)
				return false;
		}

		return true;
	}

	public static void main(String[] args)
	{
		System.out.println("Enter size of array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter array elements:");
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Output:");
		if (isMirrorInverse(arr))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
