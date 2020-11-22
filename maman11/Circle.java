import java.util.*;
class Circle {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double lx, ly, rx, ry;
		System.out.println("Insert the 4 parameters");
		lx = reader.nextDouble();
		ly = reader.nextDouble();
		rx = reader.nextDouble();
		ry = reader.nextDouble();
		double innerRadius = Math.abs((double)ly - (double)ry) / 2;
		double innerArea = Math.PI * innerRadius * innerRadius;
		double innerPerimeter = 2 * innerRadius * Math.PI;

		double outerRadius = Math.sqrt(Math.pow(lx - rx, 2) + Math.pow(ly - ry, 2)) / 2; 
		double outerArea = Math.PI * outerRadius * outerRadius;
		double outerPerimeter = 2 * outerRadius * Math.PI;
		System.out.println("Incircle: radius = " + innerRadius + ", area = " + innerArea + ", perimiter = " + innerPerimeter);
		System.out.println("Excircle: radius = " + outerRadius + ", area = " + outerArea + ", perimiter = " + outerPerimeter);
	}
}