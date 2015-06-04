public class Loops {

	public static void main(String[] args) 
	{
		int[] array1 = {27, 24, 23, 27};
		int searchvalue = 24;
		int number1= 27;
		int number2= 24;
		int number3= 25;
		problemOne(array1, 23);
		searchOccurences(array1, 25);
		searchOccurences(array1, 29);
		searchOccurences(array1, 28);
		//problem1
	}



public static void problemOne (int[] array, int searchvalue)
{
	for (int i = 0;i < array.length; i++)
	{
		if(array[i] == searchvalue)
		{
			System.out.println("The value is " + array[i]);
		}
			break;}
		
		}
		


public static void searchOccurences (int[] array, int number)
{ 
	int numberofoccurences = 0;
	for (int i = 0; i < array.length; i++)
	{
		if (array[i] == number)
		{
			numberofoccurences++;
			//problem2
		}
	}
	System.out.println("Found " + number + " in array " + numberofoccurences + " times");
}
	}