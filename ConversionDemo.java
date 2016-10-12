/**
   Mohammed Raza
   CSC 236 - Lab4 #2 (main)
*/

import java.util.*;

public class ConversionDemo
{
	public static void main(String[] args)
	{
		StackClass<Integer> intStack1 = new StackClass<Integer>(50);
		StackClass<Integer> intStack2 = new StackClass<Integer>(50);
		StackClass<Integer> intStack3 = new StackClass<Integer>(50);

		try
		{
			int num1;
			int base1;

			Scanner keyboard = new Scanner(System.in);

			System.out.println("::: Base Conversion :::");

			System.out.print("\nEnter a number in base 10: ");
			num1 = keyboard.nextInt();
			System.out.print("\nEnter a base number (2-9) for conversion: ");
			base1 = keyboard.nextInt();

			while(num1 > 0)
			{
				intStack1.push(num1 % base1);

				num1 = num1/base1;
			}

			System.out.print("\nThe converted number is: ");

			while(!intStack1.isEmptyStack())
			{
				System.out.print(intStack1.peek());
				intStack1.pop();
			}


			int num2;
			int base2;

			System.out.print("\n\nEnter a number in base 10: ");
			num2 = keyboard.nextInt();
			System.out.print("\nEnter a base number (2-9) for conversion: ");
			base2 = keyboard.nextInt();

			while(num2 > 0)
			{
				intStack2.push(num2 % base2);

				num2 = num2/base2;
			}

			System.out.print("\nThe converted number is: ");

			while(!intStack2.isEmptyStack())
			{
				System.out.print(intStack2.peek());
				intStack2.pop();
			}


			int num3;
			int base3;

			System.out.print("\n\nEnter a number in base 10: ");
			num3 = keyboard.nextInt();
			System.out.print("\nEnter a base number (2-9) for conversion: ");
			base3 = keyboard.nextInt();

			while(num3 > 0)
			{
				intStack3.push(num3 % base3);

				num3 = num3/base3;
			}

			System.out.print("\nThe converted number is: ");

			while(!intStack3.isEmptyStack())
			{
				System.out.print(intStack3.peek());
				intStack3.pop();
			}

		}

		catch (StackOverflowException sofe)
		{
			System.out.println(sofe.toString());
			System.exit(0);
		}


		System.out.println("");
	}
}
