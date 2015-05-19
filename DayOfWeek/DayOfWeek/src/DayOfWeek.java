import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a new day of week:\n");
		String day = scanner.next();
		System.out.println("I read this day of week " + day);
		
		DayOfWeek dayOfWeekEvaluator = new DayOfWeek();
		dayOfWeekEvaluator.EvaluateDayOfWeek(day);
		 
		scanner.close();
	}

	void EvaluateDayOfWeek(String dayOfWeek)
	{
		if (dayOfWeek != null)
		{
			String lowerCaseDayOfWeek = dayOfWeek.toLowerCase();
			
			switch(lowerCaseDayOfWeek)
			{
			case("Monday"):
			case("Tuesday"):
			case("Wednesday"):
			case("Thursday"):
			case("Friday"):
			{
				System.out.println(" It is a weekday, I have to go to work  : ");
				break;
			}
			case("Saturday"):
			case("Sunday"):
			{
				System.out.println("I is a weekend,TURN UP");
				break;
			}
				
			
			}
			}
			//if 	(dayOfWeek.equalsIgnoreCase("Saturday")
				//||dayOfWeek.equalsIgnoreCase("Saturday"))
				{
				//System.out.println(dayOfWeek + " Is the Weekend!!!!");
				}
			//else if (dayOfWeek.equalsIgnoreCase("Monday")
			//		||dayOfWeek.equalsIgnoreCase("Tuesday")
			//		||dayOfWeek.equalsIgnoreCase("Wednesday")
			//		||dayOfWeek.equalsIgnoreCase("Thursday")
			//		||dayOfWeek.equalsIgnoreCase("Friday"))
			{
				//System.out.println(dayOfWeek + " is a weekday, I have to go to the store");		
			}
			//else
			{
			//	System.out.println(dayOfWeek + "is not even a valid day!!");
			}
		}
}

