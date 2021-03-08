package week4;

//The program reads names that are input by the user to count how many times each name appears

import java.util.HashMap; //To Use Hashmap
import java.util.Iterator;//To Use Iterator
import java.util.Map;

import acm.program.ConsoleProgram;
public class NameCounts extends ConsoleProgram {
	
	public void run() {
		HashMap<String,Integer> nameMap = new HashMap< String, Integer>();
		
		readNames(nameMap);
		printMap(nameMap);
	}
	//Reads the names in the list and stores how many times each name appears (Boolean)
	private void readNames( Map < String, Integer> map) {
		while (true) {
			String name = readLine("Enter name:");
			if (name.equals("")) break;
	
	//Keeps track if a name appeared previously and keeps count. If it didn't, it will track the new name		
			Integer count = map.get(name);
			if (count == null) {
				
				count = 1;
			}else {
				count++;
			}
			map.put(name, count);
		}
	}
	//Prints the final count of all the names 
	private void printMap(Map<String, Integer> map) {
		Iterator <String> it = map.keySet() .iterator();
		while (it.hasNext()) {
			String key = it.next();
			int count = map.get(key);
			println("Entry[" + key + "] has count " + count);
		}
	}
}
