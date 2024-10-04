package homeassignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="refer";
		int a =s.length();
		String reverse="";
		for(int i=a-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		if(s.equals(reverse))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
			
			
		}
		
		

	}


