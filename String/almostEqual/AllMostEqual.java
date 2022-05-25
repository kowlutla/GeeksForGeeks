package almostEqual;
import java.util.Scanner;

public class AllMostEqual {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String1:");
		String s1=sc.nextLine();
		System.out.print("Enter String2: ");
		String s2=sc.nextLine();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		int count=countChars(s1,s2);
		System.out.println("No of Modifications are required to become Anagrams: "+count);

	}
	  
    static int countChars(String s1, String s2)
    {
        
       //Your code 
       int array[]=new int[26];
       for(char c:s1.toCharArray())
       {
           array[c-'a']++;
       }
       for(char c:s2.toCharArray())
       {
           array[c-'a']--;
       }
       int count=0;
       for(int i=0;i<26;i++)
       {
           count=count+Math.abs(array[i]);
       }
       return count;
    }

}
/*Given two strings S1 and S2 consisting of only lowercase 
* characters whose anagrams are almost equal. The task is to 
*count the number of characters which needs to be edited(delete) to make S1 equal to S2.
*/
 