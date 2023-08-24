package collections_exercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayListPractice2 {
    public static void main(String[] args) {
//        ArrayList<String> wordList = new ArrayList<>();
//        wordList.add("cat");
//        wordList.add("catnip");
//        wordList.add("gator");
//        wordList.add("bikes");
//        wordList.add("as");
//        wordList.add("bike");
        String testString = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] strSplit = testString.split(" ");
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(strSplit));


        int wordLength;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the word here: ");
        wordLength = input.nextInt();

        for (String word : wordList) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }
}
