package se.lexicon;

import java.util.Scanner;

public class WordReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        StringBuilder text = new StringBuilder(word);
        text.reverse();
        System.out.println("Reversed: " + text);
    }
}
