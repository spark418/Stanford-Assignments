package week2;
import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	
	
	public void run() {
		println( "This program lists the Fibonacci sequence" );
		int term = 0;
		int counter = 0;
		
		while (term <= MAX_TERM_VALUE) {
			
			if (counter != 0) 
				println(term);
				term = fib(counter);
			
			counter++;}
		}
	private int fib(int n) {
		
		if (n==0) {
			return term1;
		}else if (n ==1) {
			return term2;
	   }else{
			int temp = term1 + term2;
			term1 = term2;
			term2 = temp;
			
			return temp;
	   }
	}
	private int term1 = 0;
	private int term2 = 1;
	private static final int MAX_TERM_VALUE = 10000;
   }

