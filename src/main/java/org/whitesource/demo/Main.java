package org.whitesource.demo;

/**
 * @author artiom.petrov
 */
public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

//        String input = swapCase(args[0]);
        String input = StringUtils.swapCase(args[0]);
        System.out.println("You've entered the following text: " + input);
    }

    /* --- Private methods --- */

    private static String swapCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            String letter = String.valueOf(text.charAt(i));
            if (letter.matches("[a-z]")) {
                // swap each lowercase letter to uppercase
                result.append(letter.toUpperCase());
            } else if (letter.matches("[a-z]")) {
                // swap each uppercase letter to lowercase
                result.append(letter.toLowerCase());
            } else {
                result.append(letter);
            }
        }
        return result.toString();
    }
}
