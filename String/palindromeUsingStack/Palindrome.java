package palindromeUsingStack;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=sc.nextLine();
		if(palindromeCheck(s))
		{
			System.out.println(s+" is Palindrome");
		}
		else
		{
			System.out.println(s+" is not palindrome ");
		}

	}

	private static boolean palindromeCheck(String s) {
		
		int mid=s.length()/2;
		Stack<Character>stack=new Stack<Character>();
		int i=0;
		for(i=0;i<mid;i++)
		{
			stack.push(s.charAt(i));
		}
		
		if(s.length()%2!=0)
		{
			i=i+1;
		}
		while(i<s.length())
		{
			if(s.charAt(i)!=stack.pop())
			{
				return false;
			}
			i++;
		}
		return true;
	}

}
