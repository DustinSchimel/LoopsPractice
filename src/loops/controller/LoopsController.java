package loops.controller;

import java.util.List;

import monster.model.MarshmallowMonster;

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
		
		String[] plantsArray;
		
		
	}
}
