import java.util.HashSet;
import java.util.Scanner;

public class FindTripletsWithSumZero {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter element: ");
			array[i]=sc.nextInt();
		}
		
		boolean iszero=findTriplets(array,n);
		if(iszero)
		{
			System.out.println("Yes sum zero there ");
		}
		else
		{
			System.out.println("No Sum zero is not there");
		}

	}
	
	
	public static boolean findTriplets(int array[] , int n)
    {
        for(int i=0;i<n;i++)
        {
            HashSet<Integer>set=new HashSet<Integer>();
            
            for(int j=i+1;j<n;j++)
            {
               int x=-(array[i]+array[j]);
                if(set.contains(x))
                {
                    return true;
                }
                else
                {
                    set.add(array[j]);
                }
            }
        }
        return false;
    }

}
