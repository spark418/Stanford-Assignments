package week2;

import java.util.Random;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class RandomCircles extends GraphicsProgram {
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int NumberofCircles = 10;
	private static final double Max_Radius = 50;
	private static final double Min_Radius = 5;

	public void run() {
		 for (int i = 0; i < NumberofCircles; i++) {
		 double a = rgen.nextDouble(Min_Radius, Max_Radius);
		 double b = rgen.nextDouble(0, getWidth() - 2 * a);
		 double c = rgen.nextDouble(0, getHeight() - 2 * a);
		 GOval circle = new GOval(b, c, 2 * a, 2 * a);
		 circle.setFilled(true);
		 circle.setColor(rgen.nextColor());
		 add(circle);
		 }
		 }

	
}