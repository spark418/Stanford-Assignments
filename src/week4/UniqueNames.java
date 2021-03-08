package week4;

import acm.program.ConsoleProgram;
import acmx.export.java.util.ArrayList;

public class UniqueNames extends ConsoleProgram {
	
	public void run() {
		ArrayList list = new ArrayList();
		while (true) {
			String name = readLine("Enter name: ");
			if (name.equals("")) break;
			if (!list.contains(name)) {
				list.add(name);
			}
		}
		
		println("Unique name list contains:");
		printList(list);
	}
	private void printList(ArrayList list) {
		for(int i = 0; i < list.size(); i++) {
			println(list.get(i));
		}
	}
	
}
