import java.util.ArrayList;
import java.util.Scanner;


// Author: Evan Glazer

public class CandyStore {


	public static void populateData()
	{
		Scanner sc = new Scanner(System.in);
		int variants;
		double money;
		ArrayList<Integer> calories = new ArrayList<Integer>();
		ArrayList<Double> candyPrice = new ArrayList<Double>();
		
		// read in variants and money
		variants = sc.nextInt();
		money = sc.nextDouble();
		
		for(;;)
		{
			// base case if results in the last line
			if(sc.nextInt() == 0 && sc.nextDouble() == 0.00)
			{
				break;
			}
			
			// read in calories and candy
			for(int i=0; i<variants; i++)
			{
				calories.add(sc.nextInt());
				candyPrice.add(sc.nextDouble());
				
			}
			
			// read in variants and money again 
			variants = sc.nextInt();
			money = sc.nextDouble();
		}
		// add call to candystore
		candyStore(0, calories, candyPrice, money);
	}
	
	public static int candyStore(int var, ArrayList<Integer> calories, ArrayList<Double> candyPrice, double money)
	{
		
		// base case
		if(money < 0.00 || var >= calories.size())
			return 0;
		
		// if candy price is greater than money then go to next one
		if(candyPrice.get(var) > money)
			return candyStore(var+1, calories, candyPrice, money);
		
		// else find max
		else
			return Math.max(candyStore(var+1, calories, candyPrice, money), 
					candyStore(var, calories, candyPrice, (money - candyPrice.get(var))) + calories.get(var));

	}
    public static void main(String[] args)
    {
    	populateData();
    }
}
