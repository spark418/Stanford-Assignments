package week4;

import acm.program.ConsoleProgram;

public class WordCount extends ConsoleProgram {
	
	public void run() {
		int lines = 0;
		int words = 0;
		int chars = 0;
		BufferReader rd = openFileReader(File: "");
		try {
			while (true) {
				String line = rd.readLine();
				if (line == null) break;
				lines++
				words += countWords(line);
				chars += line.length();
			}
			rd.close();
			catch (IOException ex) {
			println("An I/O exception has occurred");
			}
		println("Lines = " + lines);
		
	}
	
}
