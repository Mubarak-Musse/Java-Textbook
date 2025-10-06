


/**
 * Write a program that dispalys the area and perimeter of a circle that has a radius of 5.5
 *  using the following formual 
 *          perimeter = 2 * radius * Pi
 *          area = radius * radius * Pi
 **/

public class  AreaAndPerimeterOfCircle {

	public static void main(String[] args) {

		final double Pi_Value = 3.14159;
		double radius = 5.5;

		System.out.println("Perimeter = " + 2 * radius * Pi_Value );
		System.out.println("Area = " + radius * radius * Pi_Value);


	}

}
