package edu.cofc.csci221.ui;
/**
 * 
 * @author Kaitlyn Fulford
 * @since December 1, 2014
 * This class inherits from the Line class. The class creates a Kochline, which is a line that forms a Koch 
 * snowflake in the TestFractalUI class.
 *
 */
public class KochLine extends Line {
	private Point p1 = null;
	private Point p2 = null;
	private Point p3 = null;
	private Point p4 = null;
	private Point p5 = null;
	
	/**
	 * Constructor
	 * 2 parameters
	 * @param start
	 * @param end
	 */
	public KochLine (Point start, Point end) { 
		super(start,end);
		p1 = getStart();
		p5 = getEnd();
	}
	/**
	 * Pre-Condition: none
	 * Post-Condition: the first segment of the fractal KochLine is returned
	 * The getLineA method is a getter for the KochLine class.
	 * @return lineA that is a KochLine object
	 */
	public KochLine getLineA() {
		KochLine lineA = new KochLine(p1, p2);
		return lineA; 
	}
	/**
	 * Pre-Condition: none
	 * Post-Condition: the second segment of the fractal kochline is returned
	 * The getLineB method is a getter for the KochLine class.
	 * @return lineB that is a KochLine object
	 */
	public KochLine getLineB() {
		KochLine lineB = new KochLine(p2, p3);
		return lineB; 
	}
	/**
	 * Pre-Condition: none
	 * Post-Condition: the third segment of the kochline is returned
	 * The getLineC method is a getter for the KochLine class.
	 * @return lineC that is a KochLine object
	 */
	public KochLine getLineC() {
		KochLine lineC = new KochLine(p3, p4);
		return lineC; 
	}
	/**
	 * Pre-Condition: none.
	 * Post-Condition: the fourth segment of the kochline is returned
	 * The getLineD method is a getter for the KochLine class.
	 * @return lineD which is a KochLine object
	 */
	public KochLine getLineD() {
		KochLine lineD = new KochLine(p4, p5);
		return lineD; 
	}
	/**
	 * Precondition: none.
	 * Postcondition: computes p2, p3, and p4 (x,y) coordinate values 
	 * The computeFractal method computes the p2, p3, p4 points.
	 */
	public void computeFractal() { 
		int deltaX = p5.getX() - p1.getX();
		int deltaY = p5.getY() - p1.getY();
		
		p2 = new Point();
		p2.setX((int) p1.getX() + (deltaX / 3));
		p2.setY((int) p1.getY() + (deltaY / 3));
		
		p3 = new Point();
		p3.setX((p1.getX() + p5.getX()) / 2  + (int) (Math.sqrt(3) * (p1.getY() - p5.getY()) / 6));
		p3.setY((p1.getY() + p5.getY()) / 2  + (int) (Math.sqrt(3) * (p5.getX() - p1.getX()) / 6));
		
		p4 = new Point();
		p4.setX((int) p1.getX() + ((2 * deltaX) / 3)); 
		p4.setY((int) p1.getY() + ((2 * deltaY) / 3));
		
	}
	/**
	 * Pre-Condition: none. 
	 * Post-Condition: if all the KochLine segments (A, B, C, and D) are valid then return true; otherwise return false
	 * @return this returns a boolean 
	 */
	public Boolean isKochLineValid() {
		Boolean valid = false;
		if (getLineA().isValid() && getLineB().isValid() && getLineC().isValid() && getLineD().isValid() ) {
			return valid = true;
		}
		return valid;
	}
	
	

}
