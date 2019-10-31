package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> words = new ArrayList<String>();
		//2. Add five Strings to your list
		words.add("Help");
		words.add("I'm");
		words.add("Trapped");
		words.add("in a");
		words.add("code factory");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
		
		//4. Print all the Strings using a for-each loop
		for (String string : words) {
			System.out.println(words);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < words.size(); i++) {
			if(i%2==0) {
			System.out.println(words.get(i));
			}
			}
		//6. Print all the Strings in reverse order.
		for (int i = words.size()-1; i>0 ; i--) {
			System.out.println(words.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < words.size(); i++) {
			for (int j = 0; j < words.get(i).length(); j++) {
		Character c=words.get(i).charAt(j);
		if (c=='e') {
			System.out.println(words.get(i));
			i++;
		}
	}
		}
	}
}
