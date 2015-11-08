package candystore;

import java.util.*;
import java.awt.*;

public class candy {
	
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int numcases = input.nextInt();

		int calories = 0;
		
		int candycost = 0;
		
		int cash = (int)(input.nextDouble());
		
	//	System.out.println(cash);
		//program orignally derped so had to debug with that
		
		
		while(numcases != 0)
		{	
			int[] candyArray = new int[cash +1];
			//this is our array that we will use to find maximum cal per dollar spent
			
			for(int i = 0; i < numcases; i++)
			{
				calories = input.nextInt();
				
				candycost = (int)(input.nextDouble());
			//	System.out.println(candycost); for debugging
				//gets cost as double convert to int
				
				for(int j = candycost; j<candyArray.length; j++)
				{
					candyArray[j] = Math.max(candyArray[j], candyArray[j - candycost] +calories);
					//find max combinations by traversing array
				}
				
			}
			System.out.println(candyArray[candyArray.length - 1]);
			//print out value
			numcases = input.nextInt();
			cash = (int)(input.nextDouble());
			//get next case and candy
			
		}
	//	input.close();
		//probably should reclose this but who cares
	}

}
