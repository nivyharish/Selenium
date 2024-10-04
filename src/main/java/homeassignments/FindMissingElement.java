package homeassignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,4,3,2,8,6,7};
		Arrays.sort(array);
	
		for(int i=0;i<=array.length-1;i++)
		{
			if(array[i+1] != array[i]+1)
			{
				System.out.println("Missing Element is :"+(array[i]+1));
				break;
				
			}
		}
		

	}

}
