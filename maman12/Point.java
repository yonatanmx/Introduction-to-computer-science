import java.util.*;

/**
 * Represents 2 dimensional points.
 * 
 * @author Jonathan Marx
 * @version 2020
 * 
 * 
 * 
 * 
*/


public class Point {
	private double _radius;
	private double _alpha;
	
	//constructor
	/**
	 * Constructor for objects of class Point. Construct a new point with the specified x y coordinates. If the x coordinate is negative it is set to zero. If the y coordinate is negative it is set to zero.
	 * 
	 * @param x  The x coordinate 
	 * @param y  The y coordinate
	 * 
	 */
	public Point(double x, double y) {

	}


	//constructor
	/**
	 * Constructor for objects of class Point. Copy constructor, construct a point using another point.
	 * 
	 * @param other The point from which to construct the new object
	 * 
	 */
	public Point(Point other) {

	}

	//Method
	/**
	 * This method sets the x coordinate of the point.
	 * @param num The new x coordinate
	 */
	public void setX(double num) {
		double x = num;
		double y = this.getY();
		this._radius = Math.sqrt(Math.pow(y, 2) + Math.pow(x, 2));
		this._alpha = Math.atan(y / x);
	}

	//Method
	/**
	 * This method sets the y coordinate of the point.
	 * @param num The new y coordinate
	 */
	public void setY(double num) {
		double y = num;
		double x = this.getX();
		this._radius = Math.sqrt(Math.pow(y, 2) + Math.pow(x, 2));
		this._alpha = Math.atan(y / x);
	}

	//Method
	/**
	 * This method sets the x coordinate of the point.
	 * @return The x coordinate of the point
	 */
	public double getX() {
		return this._radius * Math.cos(_alpha); 
	}

	//Method
	/**
	 * This method sets the y coordinate of the point.
	 * @return The y coordinate of the point
	 */
	public double getY() {
		return _radius * Math.sin(_alpha); 
	}

	//Method
	/**
	 * Returns a string representation of Point in the format (x,y).
	 * @return A String representation of the Point
	 */
	public String toString() {
		return "(" + (Math.round(this.getX()*10000)/(double)10000).toString() + "," + (Math.round(this.getY()*10000)/(double)10000).toString() + ")";
	}

	//Method
	/**
	 * Check if the given point is equal to this point.
	 * 
	 * @param other The point to check equality with
	 * @return True if the given point is equal to this point
	 */
	public boolean equals(Point other) {
		return (this.getX() == other.getX() && this.getY() == other.getY());
	}

	//Method
	/**
	 * Check if this point is above a received point.
	 * 
	 * @param other The point to check if this point is above
	 * @return True if this point is above the other point
	 */
	public boolean isAbove(Point other) {
		return (this.getY() > other.getY());
	}


	//Method
	/**
	 * Check if this point is under a received point.
	 * 
	 * @param other The point to check if this point is below
	 * @return True if this point is below the other point
	 */
	public boolean isUnder(Point other) {
		return other.isAbove(this);
	}

	//Method
	/**
	 * Check if this point is left of a received point.
	 * 
	 * @param other The point to check if this point is left of
	 * @return True if this point is left of the other point
	 */
	public boolean isLeft(Point other) {
		return (this.getX() < other.getX());
	}

	//Method
	/**
	 * Check if this point is right of a received point.
	 * 
	 * @param other The point to check if this point is right of
	 * @return True if this point is right of the other point
	 */
	public boolean isRight(Point other) {
		return other.isLeft(this);
	}

	//Method
	/**
	 * Check the distance between this point and a given point.
	 * 
	 * @param other The point to check the distance from
	 * @return The distance
	 */
	public double distance(Point other) {
		return Math.sqrt(Math.pow(this.getX() - other.getX(), 2) + Math.pow(this.getY() - other.getY(), 2));
	}

	//Method
	/**
	 * Moves a point.
	 * 
	 * @param dx The difference to add to x
	 * @param dy The difference to add to y
	 */
	public void move(double dx, double dy) {
		if(this.getX() + dx >= 0)	
			this.setX(this.getX() + dx);
		if(this.getY() + dy >= 0)	
			this.setY(this.getY() + dy);
	}

}