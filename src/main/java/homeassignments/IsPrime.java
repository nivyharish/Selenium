package homeassignments;

public class IsPrime {

	public static void main(String[] args) {
		int i,j;
		
		for (i=1;i<=10;i++)
		{
			int count =0;
			for (j=1;j<=i;j++)
			{
				if (i%j==0)
				{
				
				count ++;
				}
				
			}

		if(count==2)
		{
			System.out.println(i+ "is a Prime Number");
		}
		else
		{
			System.out.println(i+"is not a Prime Number");
		}
			
		}
	}
}
		
	
		// TODO Auto-generated method stub

	


