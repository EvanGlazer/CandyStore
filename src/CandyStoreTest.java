import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

//Author: Evan Glazer

public class CandyStoreTest {

	@Test
	public void testCandyStore()
	{
		// set up items
		ArrayList<Integer> calories = new ArrayList<Integer>();
		ArrayList<Double> candyPrice = new ArrayList<Double>();
		calories.add(700);calories.add(199);
		candyPrice.add(7.00); candyPrice.add(2.00);
		
		assertEquals(796, CandyStore.candyStore(0, calories, candyPrice, 8.00));
	}
	
	@Test
	public void testCandyStore2()
	{
		// set up items
		ArrayList<Integer> calories = new ArrayList<Integer>();
		ArrayList<Double> candyPrice = new ArrayList<Double>();
		calories.add(700);calories.add(299);calories.add(499);
		candyPrice.add(7.00); candyPrice.add(3.00); candyPrice.add(5.00);

		assertEquals(798, CandyStore.candyStore(0, calories, candyPrice, 8.00));
	}
	
	@Test
	public void testCandyStore3()
	{
		// set up items
		ArrayList<Integer> calories = new ArrayList<Integer>();
		ArrayList<Double> candyPrice = new ArrayList<Double>();
		calories.add(600);calories.add(199);calories.add(300);
		candyPrice.add(3.00); candyPrice.add(1.50); candyPrice.add(2.50);

		assertEquals(1399, CandyStore.candyStore(0, calories, candyPrice, 8.00));
	}

}
