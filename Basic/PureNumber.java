import java.util.Scanner;

public class PureNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N for first N pure number: ");
		int n=sc.nextInt();
		int i=10;
		int count=0;
		while(true)
		{
			if(count==n)
			{
				break;
			}
			if(pureNumber(i))
			{
				System.out.print(i+" ");
				count++;
			}
			i++;
		}

	}
	
	static boolean pureNumber(int n)
	{
		if(isEvenDigits(n) && isPalindrome(n) && isContainDigits(n))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private static boolean isContainDigits(int n) {
		
		int k=n;
		while(k!=0)
		{
			int digit=k%10;
			if(digit!=5 && digit!=4)
			{
				//System.out.println("Digit: "+digit);
				return false;
			}
			k=k/10;
		}
		return true;
	}

	private static boolean isPalindrome(int n) {
		
		int k=n;
		int sum=0;
		while(k!=0)
		{
			int digit=k%10;
			sum=sum*10+digit;
			k=k/10;
		}
		
		if(sum==n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private static boolean isEvenDigits(int n) {
		
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		if(count%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}



/*
It has even number of digits.
All the digits are either 4 or 5.
And the number is a palindrome.*/

