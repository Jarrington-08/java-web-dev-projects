package org.launchcode;

import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, ‘and what is the use of a " +
                "book,’ thought Alice ‘without pictures or conversation?’";

        sentence = sentence.toLowerCase();

        Scanner input = new Scanner(System.in);

        System.out.println("Which word would you like to search?");
        String query = input.nextLine().toLowerCase();

        if (sentence.contains(query)) {
            int queryLength = query.length();
            int queryIndex = sentence.indexOf(query);

            System.out.println(sentence.contains(query));
            System.out.println("Your query is found at index: " + queryIndex + " and is of length: " + queryLength);

            String part1 = sentence.substring(0,queryIndex);
            String part2 = sentence.substring(queryIndex+queryLength);

            System.out.println(part1 + part2);
        } else {
            System.out.println(false);
        }
    }
}