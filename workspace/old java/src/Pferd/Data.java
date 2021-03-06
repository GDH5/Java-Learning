package Pferd;
import java.util.Arrays;
import java.util.Random;

public class Data {
	public int[] stuff;
	public double average;
	
	//membership functions.
	public void InitStuff(int nbr)
	{
		for (int i=0; i < stuff.length; i++)
		{
			stuff[i] = nbr;
		}
	}
	
	public void InitRndStuff(int seed, int range)
	{
		Random rnd = new Random(seed);
		
		for (int i=0; i < stuff.length; i++)
		{
			stuff[i] = rnd.nextInt(range);
		}
	}
	
	public Data()
	{
		
	}

	public Data(int n, int nbr)
	{
		stuff = new int[n];
		InitStuff(nbr);
	}
	
	public void Puts()
	{
	System.out.println(Arrays.toString(stuff));
	System.out.println("The sum of the array is: " + Sum());
	System.out.println("The average of the array is: " + Average());
	
	}
	
	public int Sum()
	{
		int sum = 0;
		
		for (int i = 0; i < stuff.length; i++)
		{
			sum += stuff[i];
		}
		return sum;
	}
	
	public double Average()
	{
		average = (Sum() / (double)stuff.length);
		return average;
	}
	
}
