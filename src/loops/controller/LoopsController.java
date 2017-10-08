package loops.controller;

import java.util.List;
import java.util.ArrayList;


public class LoopsController
{
	public void start()
	{
		boolean isColorGreen = false;
		int numberOfPlants = 1;
		int counting = 0;
		int deadPlants = 0;
		
		while (isColorGreen == false)
		{
			System.out.println("The plant's color is not green currently");
			counting++;
			
			if (counting == 5)
			{
				System.out.println("The plant's color is now green");
				isColorGreen = true;
			}
		}
		
		System.out.println("");
		
		while (numberOfPlants < 900)
		{
			System.out.println("The current amount of plants is " + numberOfPlants);
			numberOfPlants = numberOfPlants + 150;
		}
		
		System.out.println("The final amount of plants is " + numberOfPlants);
		
		System.out.println("");
		
		for (int counter = 900; counter > 500; counter -= 100)
		{
			deadPlants += 100;
			numberOfPlants -= 100;
			System.out.println(deadPlants + " plants have died! You have " + numberOfPlants + " left!");
		}
		
		System.out.println("");
		
		for (int counter = 1; counter <= 10; counter++)
		{
			System.out.println("Your #" + counter + " plant is allowed to live.");
		}
		
		System.out.println("");
		
		numberOfPlants -= 491;
		
		System.out.println("Your remaining plants will be put into a group.");
		
		System.out.println("");
		
		String[] plantsArray = {"Plant #1", "Plant #2", "Plant #3", "Plant #4", "Plant #5", "Plant #6", 
								"Plant #7", "Plant #8", "Plant #9", "Plant #10", };
		
		for (String plant : plantsArray)
		{
			System.out.println(plant);
		}
		
		System.out.println("");
		
		int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int number : numbersArray)
		{
			System.out.println(number);
		}
		
		System.out.println("");
		
		for (int loop = 0; loop < 10; loop++)
		{
			System.out.println("My favorite number is " + numbersArray[loop]);
			
			for (int loop2 = 0; loop2 < 2; loop2++)
			{
				System.out.println("Wait no, my favorite number is actually " + numbersArray[loop] + loop2);
			}
		}
	}
}
