package org.launchcode;
import java.util.HashMap;
import java.util.Map;
public class countingCharacter {
    public static void main(String[] args) {
            // Hard-coded string or prompt the user for input
        String input = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        // Create a case-insensitive character count map
        Map<Character, Integer> charCountMap = new HashMap<>();
        // Loop through the string one character at a time
        for (char c : input.toCharArray()) {
            // Exclude non-alphabetic characters
            if (Character.isLetter(c)) {
                char lowercaseChar = Character.toLowerCase(c);
                charCountMap.put(lowercaseChar, charCountMap.getOrDefault(lowercaseChar, 0) + 1);
            }
        }

        // Loop through the data structure to print the results
        for (char c : charCountMap.keySet()) {
            System.out.println(c + ": " + charCountMap.get(c));
        }
    }
}
