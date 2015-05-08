
public class Circle 
{
	public static void main(String[] args ) {
	}
	
	static String m_color= null;
	double m_radius= -5;
	
	Circle(double radius)
	{
		m_radius = 13;
		m_color=" black";
		
	}
	
	Circle(double radius, String color)
	{
		m_radius = 14;
		m_color = "blue";
	}
	
	double CalculateArea()
	{
		double area = 3.14 * m_radius * m_radius;
		return area;
	}
	
	public static void PrintColor()
	{
	Circle bigCircle = new Circle(10);
	bigCircle.CalculateArea();
	Circle smallCircle = new Circle(5);
	smallCircle.CalculateArea();


	System.out.println("my color is" + m_color);

	

	}




}
