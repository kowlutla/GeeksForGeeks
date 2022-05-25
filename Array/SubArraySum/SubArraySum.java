package SubArraySum;

import java.util.Scanner;

public class SubArraySum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No of testCases :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter length of array:");
			int length=sc.nextInt();
			int array[]=new int[length];
			System.out.print("Enter sum: ");
			int sum=sc.nextInt();
			for(int j=0;j<length;j++)
			{
				System.out.print("Element "+(j+1)+" : ");
				array[j]=sc.nextInt();
			}
			int value=subArraySum(array,sum,array.length);
			if(value==0)
			{
				System.out.println("No subarray");
			}
		}
		
	}

	private static int subArraySum(int[] array,int sum,int length) {
		int csum=0;
		for(int j=0;j<length;j++)
		{
			csum=array[j];
			for(int k=j+1;k<length;k++)
			{
				if(sum==csum)
				{
					System.out.println(j+" "+(k-1));
					return 1;
				}
				if(csum>sum)
				{
					break;
				}
				csum=csum+array[k];
			}
		}
		return 0;
	}

}
