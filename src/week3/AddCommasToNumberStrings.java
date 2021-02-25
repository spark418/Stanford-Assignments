package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
	private String addCommasToNumericString(String digits) {
		String result = "";
		int len = digits.length();
		int nDigits = 0;
		for (int i = len - 1; i >= 0; i--) {
		result = digits.charAt(i) + result;
		nDigits++;
		if (nDigits % 3 == 0 && i > 0) {
		result = "," + result;
		}
		}
		return result;
		}
}