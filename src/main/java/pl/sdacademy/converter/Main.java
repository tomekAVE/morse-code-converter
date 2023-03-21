package pl.sdacademy.converter;
import java.util.*;
import java.util.Scanner;

public class Main {


/*
    public class MorseCodeConverter {


        private static final String[] morseCodes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", " "};
        private static final char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' '};

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter text to convert to Morse code:");
            String input = scanner.nextLine().toUpperCase();

            String morseCode = convertToMorseCode(input);
            System.out.println("Morse code: " + morseCode);

            System.out.println("Enter Morse code to convert to text:");
            String morseInput = scanner.nextLine();

            String text = convertToText(morseInput);
            System.out.println("Text: " + text);

            scanner.close();
        }

        private static String convertToMorseCode(String text) {
            StringBuilder morseCode = new StringBuilder();
            for (char c : text.toCharArray()) {
                int index = getIndex(c);
                morseCode.append(morseCodes[index]).append(" ");
            }
            return morseCode.toString();
        }

        private static String convertToText(String morseCode) {
            StringBuilder text = new StringBuilder();
            String[] words = morseCode.split(" / ");
            for (String word : words) {
                String[] letters = word.split(" ");
                for (String letter : letters) {
                    int index = getMorseIndex(letter);
                    text.append(MorseCodeConverter.letters[index]);
                }
                text.append(" ");
            }
            return text.toString();
        }

        private static int getIndex(char c) {
            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == c) {
                    return i;
                }
            }
            return -1;
        }

        private static int getMorseIndex(String morseCode) {
            for (int i = 0; i < morseCodes.length; i++) {
                if (morseCodes[i].equals(morseCode)) {
                    return i;
                }
            }
            return -1;
        }

    }*/
}
