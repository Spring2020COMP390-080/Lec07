package lec7.v5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {

	public static void main(String[] args) {
		// Create a list of Strings
		List<String> words = new ArrayList<String>();

		Scanner s = new Scanner(System.in);

		while (s.hasNext()) {

			String method_name = s.next();

			if (method_name.equals("quit")) {
				break;
			}

			switch (method_name) {

			case "help":
				System.out.println("List Commands:");
				System.out.println("  add <word>");
				System.out.println("  add <index> <word>");
				System.out.println("  get <index>");
				System.out.println("  remove <index>");
				break;

			case "add":
				if (s.hasNextInt()) {
					int index = s.nextInt();
					String word_to_add = s.next();
					words.add(index, word_to_add);
				} else {
					String word_to_add = s.next();
					words.add(word_to_add);
				}
				break;

			case "get": 
			{
				int index = s.nextInt();
				String w = words.get(index);
				System.out.println("Got word at index " + index + ": " + w);
				break;
			}

			case "remove":
				if (s.hasNextInt()) {
					int index = s.nextInt();
					String w = words.remove(index);
					System.out.println("Removed word '" + w + "' at index " + index);
				} else {
					String word_to_remove = s.next();
					boolean found = words.remove(word_to_remove);
					if (found) {
						System.out.println("Found word '" + word_to_remove + "' to remove.");
					} else {
						System.out.println("Did not find word '" + word_to_remove + "' to remove.");						
					}
				}
				break;
			
			case "size":
				System.out.println("Size of list is: " + words.size());
				break;
			
			default:
				System.out.println("Unknown command: " + method_name);
				System.out.println("Try help");
			}

			System.out.println("Current list: " + words);
		}		

		System.out.println("Goodbye");
	}
}
