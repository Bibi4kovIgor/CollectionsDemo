package edu.alevel.dictionary;

import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;

public class EngUkrDictionary {

    private static final String ADD = "add";

    private static final String EXIT = "exit";
    private static final String WELCOME_MESSAGE = """
            Please input command\s
             if you input %s, add new word
              if you input word you'll get word from dictionary\s
             or error message if word was not found
            """;
    private static final String WORD_WAS_NOT_FOUND_ERROR = "Your word was not found";
    private static final Map<String, String> dictionary = new TreeMap<>();
    public static void main(String[] args) {
        String inputWord = "";
        String result = null;
        while (!inputWord.equalsIgnoreCase(EXIT)) {
            System.out.printf(WELCOME_MESSAGE, ADD);
            Scanner input = new Scanner(System.in);
            inputWord = input.nextLine();
            if (inputWord.equals(ADD)) {
                System.out.println("Add new word as key value");
                addNewElement(input.nextLine(), input.nextLine());
            } else {
                result = getWord(inputWord);
            }

            if (Objects.isNull(result)) {
                System.out.println(WORD_WAS_NOT_FOUND_ERROR);
            } else {
                System.out.println(result);
            }
        }
    }

    private static void addNewElement(String engWord, String ukrWord) {
        dictionary.put(engWord, ukrWord);
    }
    private static String getWord(String engWord) {
        return dictionary.get(engWord);
    }

    

}
