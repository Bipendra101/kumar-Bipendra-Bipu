package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {

		String expression
		= "Hi, I am Bipendra and I am an Engineer";


		String[] words = expression.split("\\e");

		Map<String, Integer> word_map = new HashMap<String, Integer>();

		for (String word : words) {

			if (word_map.get(word) != null) {
				word_map.put(word, word_map.get(word) + 1);
			}

			// if the word came once then occurrence is 1.
			else {
				word_map.put(word, 1);
			}
		}


		Set<String> word_set = word_map.keySet();


		for (String word : word_set) {


			if (word_map.get(word) > 1)

				System.out.println(word);
		}
	}

}


