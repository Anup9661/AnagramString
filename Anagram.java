import java.lang.*;
import java.io.*;
import java.util.*;
public class Anagram {

		public static void main (String[] args)
		 {
	        Scanner sc=new Scanner(System.in);
	        	System.out.print("Enter a 1st String : ");
	            String a1=sc.next();
	            System.out.print("Enter a 2nd String : ");
	            String a2=sc.next();
	            boolean rs=CheckString(a1.toLowerCase(),a2.toLowerCase());
	            if(rs)
	                System.out.println("YES");
	            else
	                System.out.println("NO");
	     }
	     public static boolean CheckString(String s1,String s2)
	        {
	            int count1[]=new int[128];
	            int count2[]=new int[128];
	            for(int i=0;i<s1.length();i++)
	            {
	                char ch1=s1.charAt(i);
	                count1[ch1]++;
	            }
	            for(int i=0;i<s2.length();i++)
	            {
	                char ch2=s2.charAt(i);
	                count2[ch2]++;
	            }
	            for(int i=0;i<count1.length;i++)
	            {
	                if(count1[i]==count2[i])
	                    continue;
	                else{
	                    return false;
	                }
	            }
	            return true;
	    }
}

