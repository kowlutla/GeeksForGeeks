package anagrams;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String1:");
		String s1=sc.nextLine();
		System.out.print("Enter String2: ");
		String s2=sc.nextLine();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		boolean anagrams=isAnagrams(s1,s2);
		if(anagrams)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}

	}

	private static boolean isAnagrams(String s1, String s2) {
		
		int array[]=new int[26];
	       for(char c:s1.toCharArray())
	       {
	           array[c-'a']++;
	       }
	       for(char c:s2.toCharArray())
	       {
	           array[c-'a']++;
	       }
	       int count=0;
	       for(int i=0;i<26;i++)
	       {
	          if(array[i]%2!=0)
	          {
	        	  return false;
	          }
	       }
	     return true;
	}

}
