package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _1_WordFinder {

	public static void main(String[] args) {
		
		
		_1_WordFinder search = new _1_WordFinder();
		List<String> pwords = search.loadWordList();
		Stream<String> streamOfWords = pwords.stream();
		List<String> foundWords = streamOfWords.filter(_1_WordFinder -> _1_WordFinder.startsWith("P")).filter(_1_WordFinder -> _1_WordFinder.length() > 10).collect(Collectors.toList());
		System.out.println(foundWords);
	}

	public static List<String> loadWordList() {
		List<String> messages = new ArrayList<String>();
		File file = new File("resource/words.txt");

		try {
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String aLine;
			while ((aLine = buffer.readLine()) != null) {
				messages.add(aLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return messages;
	}

}
