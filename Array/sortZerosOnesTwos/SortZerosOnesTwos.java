package sortZerosOnesTwos;

import java.util.Scanner;

public class SortZerosOnesTwos 
{
	public static void main (String[] args) {
		//code
		
		Scanner sc=new Scanner(System.in);
		System.out.print("No of test cases: ");
		int k=sc.nextInt();
		for(int i=1;i<=k;i++)
		{
			System.out.println("Case "+i);
			System.out.print("Length of array: ");
		    int len=sc.nextInt();
		    int array[]=new int[len];
		    for(int j=0;j<len;j++)
		    {
		    	System.out.print("Element "+(j+1)+" : ");
		        array[j]=sc.nextInt();
		    }
		    sort(array);
		    System.out.println();
		}
	}
	
	public static void sort(int array[])
	{
	  int zero=0;
	  int one=0;
	  int two=0;
	  for(int i=0;i<array.length;i++)
	  {
	      if(array[i]==0)
	      {
	          zero++;
	      }
	      else if(array[i]==1)
	      {
	          one++;
	      }
	      else
	      {
	          two++;
	      }
	  }
	  for(int i=1;i<=zero;i++)
	  {
	      System.out.print(0+" ");
	  }
	  for(int i=1;i<=one;i++)
	  {
	      System.out.print(1+" ");
	  }
	  for(int i=1;i<=two;i++)
	  {
	      System.out.print(2+" ");
	  }
	  
	}
}
