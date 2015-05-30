
public class ChineseYear {
	static int s_knownYear=1990;
		
	public static void main(String[] args){
	}
	
	public void EvaluateChineseYear(int unknownYear)
	{
		
	
	int yearDifference = unknownYear - s_knownYear;
	int remainder = yearDifference % 12;

	if (unknownYear >=1900)
		
  
    switch (remainder) {
        case 0:
        	System.out.print(unknownYear + "Year is RAT");
                 break;
        case 1: 
        	System.out.print(unknownYear + "Year is OX");
                 break;
        case 2: 
        	System.out.print(unknownYear + "Year is Tiger");
                 break;
        case 3: 
        	System.out.print(unknownYear + "Year is Rabbit");
                 break;
        case 4:
        System.out.print(unknownYear + "Year of Dragon");
                 break;
        case 5:  
        System.out.print(unknownYear + " Year of snake");
                 break;
        case 6:  
        System.out.print(unknownYear + "Year of horse");
                 break;
        case 7:  
        System.out.print(unknownYear + "Year of sheep");
                 break;
        case 8:  
        System.out.print(unknownYear + "Year of monkey");
                 break;
        case 9: 
        System.out.print(unknownYear + "Year of rooster");
                 break;
        case 10: 
        System.out.print(unknownYear + "Year of dog");
                 break;
        case 11: 
        System.out.print(unknownYear + "Year of Pig");
                 break;
     
              

	}
		
		
	}
	 
 }

