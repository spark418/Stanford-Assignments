package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {

    public void run() {
        println(removeAllOccurrences("This is a test", 't'));
        println(removeAllOccurrences("Summer is here!", 'e'));
        println(removeAllOccurrences("---0---", '-'));

    }
    private String removeAllOccurrences(String str, char ch) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {result += str.charAt(i);
            }
        }
        return result;
    }
}
