package week2;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;


public class RobotFace extends GraphicsProgram {
/*Dimensions of Robot Face
 * 
 */
	private static final int head_width = 200;
	private static final int head_height = 300;
	private static final int eye_radius = 40; 	
	private static final int mouth_width = 100;
	private static final int mouth_height = 30;
	
	public void run() {
		placeHead();
		placeRightEye();
		placeLeftEye();
		placeMouth();
	}
/*Places centered Robot Head
 * 
 */
	private void placeHead() {
		double startingWidth = ((getWidth()/2) - (head_width/2));
		double startingHeight = ((getHeight()/2) - (head_height/2));
		GRect face = new GRect (startingWidth, startingHeight, head_width, head_height);
		add(face);
		face.setFilled(true);
		face.setFillColor(Color.GRAY);
	}
/*Places Left Eye Centered and Yellow
 * 
 */
	private void placeLeftEye() {
		double startingWidth = getWidth()/2 - head_width/4 - eye_radius/2;
		double startingHeight = getHeight()/2 - head_height/4 - eye_radius/2;
		GOval leftEye = new GOval (startingWidth, startingHeight, eye_radius, eye_radius);
		add(leftEye);
		leftEye.setColor(Color.YELLOW);
		leftEye.setFilled(true);
		leftEye.setFillColor(Color.YELLOW);
	}
/*Places Right Eye Centered and Yellow
 * 
 */
	private void placeRightEye() {
		double startingWidth = getWidth()/2 + head_width/4 - eye_radius/2;
		double startingHeight = getHeight()/2 - head_height/4 - eye_radius/2;
		GOval rightEye = new GOval (startingWidth, startingHeight, eye_radius, eye_radius);
		add(rightEye);
		rightEye.setColor(Color.YELLOW);
		rightEye.setFilled(true);
		rightEye.setFillColor(Color.YELLOW);
	}
/*Places Centered Mouth and White
 * 
 */
	private void placeMouth() {
		double startingWidth = getWidth()/2 - mouth_width/2;
		double startingHeight = getHeight()/2 + head_height/4 - mouth_height/2;
		GRect mouth = new GRect (startingWidth, startingHeight, mouth_width, mouth_height);
		add(mouth);
		mouth.setColor(Color.WHITE);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);
	}
}
