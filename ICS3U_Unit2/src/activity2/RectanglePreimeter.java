/**
 * 
 */
package activity2;

/**@author Lucas Garner
 * Date: September 18, 2026
 * Course: ICS3U
 * RectanglePerimiter
 * Activity 2
 */
	import simpleIO.*;

	/**
	 * @param args
	 * Calculates and displays the perimeter of a rectangle
	 */
public class RectanglePreimeter {
	public static void main(String[] args) {
		int length = 13;       //longer side of rectangle
		int width = 4;         //shorter side of rectangle
		int perimeter;         //calculated perimeter of rectangle
		
		perimeter = length + length + width + width;
        Console.print("Perimiter of rectangle:" + perimeter);
	}
}
