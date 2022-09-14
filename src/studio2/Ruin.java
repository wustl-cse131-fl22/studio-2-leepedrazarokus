package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How much money are you starting with?");
		double startAmount = in.nextDouble();

		double winChance = 0.7;
		int winLimit = 500;

		//loop setup
		while (startAmount >= 0 && startAmount < winLimit) 
		{
			boolean coinFlip = Math.random() > 0.5;
			if (coinFlip == true)
			{
				startAmount = startAmount + 1.00;
				System.out.println(startAmount);
			} 
			else
			{
				startAmount = startAmount - 1.00;
				System.out.println(startAmount);
			}
		}
	}
}