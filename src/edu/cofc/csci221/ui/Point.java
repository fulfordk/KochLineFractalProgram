package edu.cofc.csci221.ui;
/**
 * 
 * @author Kaitlyn Fulford
 * @since 10/7/14
 * This class creates a point. 
 *
 */
public class Point {
	private int x = 0;
	private int y = 0;
	
	/**
	 * No argument constructor
	 * No parameters.
	 */
	public Point() {
		x = 0;
		y = 0;
		// initialize x and y instance variables to 0.
	}
	/**
	 * Overloaded constructor
	 * one parameter
	 * @param point
	 */
	public Point( Point point) {
			setPoint (point);
		}
		
	/**
	 * Overloaded constructor
	 * 2 parameters
	 * @param x
	 * @param y
	 */
	public Point( int x, int y) {
		setX(x);
		setY(y);
	}
	/**
	 * Pre-Condition: none.
	 * Post-Condition: value in x instance variable returned
	 * The getX method is a getter for the Point class. It doesn't depend on anything
	 * @return this returns the x value.
	 */
	public int getX() {
		return x;
	}
	/**
	 * Pre-Condition: none.
	 * Post-Condition: value in y instance variable returned
	 * The getY method is a getter for the Point class. It doesn't depend on anything.
	 * @return this returns the y value.
	 */
	public int getY() {
		return y;
	}
	/**
	 * Pre-Condition: x argument passed into method 
	 * 				 expecting value >= 0 and <= GridConstants.MAX_PANEL_WIDTH
	 * Post-Condition: x instance variable value set equal to argument value only if 
	 *                 precondition met otherwise set equal to 0
	 * @param x this is an int that stores the x value.
	 */
	public void setX( int x ) {
		if ( x >= 0 && x<= GridConstants.MAX_PANEL_WIDTH ){
			this.x = x;
		}
		else { 
			this.x = 0;
		}		
	}
	/**
	 * Pre-Condition: y argument passed into method 
	 * 				 expecting value >= 0 and <= GridConstants.MAX_PANEL_HEIGHT
	 * Post-Condition: y instance variable value set equal to argument value only if 
	 *                 precondition met otherwise set equal to 0
	 * The setY method is a setter for the Point class. It depends on the pre-condition.
	 * @param y this is an int that stores the y value.
	 */
	public void setY( int y ) {
		if (y >= 0 && y<= GridConstants.MAX_PANEL_HEIGHT ) {
			this.y = y;
		}
		else {
			this.y = 0;
		}	
	}
	/**
	 * Pre-Condition: p argument passed into method
	 * 		           expecting value not equal to null
	 * Post-Condition: x and y instance variable values set 
	 *                 to whatever x or y returned only if p is
	 *                 not equal to null. 
	 * The setPoint method is a setter for Point class. It depends on the pre-condition.
	 * @param p this is a point object
	 */
	public void setPoint( Point p ) {
		if (p != null) {
			x = p.getX();
			y = p.getY();
		}
	}
	
}
