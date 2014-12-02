package edu.cofc.csci221.ui;
/**
 * 
 * @author Kaitlyn Fulford
 * @since 10/7/14
 * This class creates a line to be used in the TestGridUI class.
 */
public class Line {
	private Point start = null;
	private Point end = null;
	
	/**
	 * Constructor
	 * 2 parameters
	 * @param start
	 * @param end
	 */
	public Line ( Point start, Point end ) {
		if (start != null && end!= null) {
			setStart( start );
			setEnd ( end );
		}
		
	}
	
	
	/**
	 * Pre-Condition: none
	 * Post-Condition: value in the start instance variable returned
	 * The getStart method is a getter for the Line class.
	 * @return this returns the start
	 */
	public Point getStart() {
		return start;
	}
	
	/**
	 * Pre-Condition: none
	 * Post-Condition: value in the end instance variable returned
	 * The getEnd method is a getter for the Line class.
	 * @return this returns the end
	 */
	public Point getEnd() {
		return end;
	}
	/**
	 * Pre-Condition: start argument passed into method
	 * 		          expecting value that is not null
	 * Post-Condition: start instance variable value set 
	 *                 equal to argument value if !=null
	 * The setStart method is a setter for the Line class. It depends on the precondition.
	 * @param start this is a point object that stores the start point.
	 * @return this method doesn't return anything
	 */
	public void setStart( Point start) {
		if (start != null) {
			this.start = start;
		}
	}
	/**
	 * Pre-Condition: end argument passed into method
	 * 		          expecting value that is not null
	 * Post-Condition: end instance variable value set 
	 *                 equal to argument value if !=null
	 * The setEnd method is a setter for Line class. It depends on the precondition
	 * @param end this is a point object that stores the end point.
	 * @return this doesn't return anything
	 */
	public void setEnd (Point end ) {
		if ( end!= null) {
			this.end = end;
		}
	}
	
	/**
	 * Pre-Condition: none.
	 * Post-Condition: if start != null and end != null then return true otherwise return false
	 * 
	 * @return this returns a boolean 
	 */
	public Boolean isValid() {
		if (start != null && end!= null) {
			return true;
		}
		else {
			return false;
		}
	}

}
