package B_IntroToJava;

import java.util.Scanner;

public class StringManipulationChallenge {

    public static void main(String[] args) {
        /*
         * This main method is ready for you to test your implementations.
         * Fill in the TODOs in the methods below, then run this program and
         * try different inputs to verify behavior.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("=== String Manipulation Challenge ===");

        // 1) Upper / Lower / Trim
        System.out.print("Enter some text: ");
        String input = sc.nextLine();

        String upper = stringToUpper(input);
        System.out.println("UPPER: " + upper);

        String lower = stringToLower(input);
        System.out.println("lower: " + lower);

        System.out.print("Enter text with extra spaces (e.g., '   hello world   '): ");
        String spaced = sc.nextLine();
        String trimmed = stringTrim(spaced);
        System.out.println("trim : '" + trimmed + "'");

        // 2) Substring
        System.out.print("Enter a string to take a substring from: ");
        String subSource = sc.nextLine();
        System.out.print("Enter start index (int): ");
        int start = readInt(sc);
        System.out.print("Enter substring length (int): ");
        int len = readInt(sc);

        try {
            String sub = stringSubstring(subSource, start, len);
            System.out.println("substring: " + sub);
        } catch (Exception e) {
            System.out.println("substring: ERROR -> " + e.getMessage());
        }

        // 3) Search char
        System.out.print("Enter a string to search in: ");
        String searchIn = sc.nextLine();
        System.out.print("Enter a single character to search for: ");
        String charStr = sc.nextLine();
        char target = (charStr.isEmpty() ? '\0' : charStr.charAt(0));
        int idx = searchChar(searchIn, target);
        System.out.println("index of '" + target + "': " + idx);

        // 4) Concat names
        System.out.print("Enter first name: ");
        String fName = sc.nextLine();
        System.out.print("Enter last name: ");
        String lName = sc.nextLine();
        String fullName = concatNames(fName, lName);
        System.out.println("Full name: " + fullName);

        System.out.println("=== Done. Now implement the TODOs in the methods! ===");
        sc.close();
    }

    private static int readInt(Scanner sc) {
        while (true) {
            String s = sc.nextLine().trim();
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid integer: ");
            }
        }
    }

    public static String stringToUpper(String myString) {
        if (myString == null) return null;
        return myString.toUpperCase();
    }

    public static String stringToLower(String usersString) {
        if (usersString == null) return null;
        return usersString.toLowerCase();
    }

    public static String stringTrim(String usersStringWithWhiteSpace) {
        if (usersStringWithWhiteSpace == null) return null;
        return usersStringWithWhiteSpace.trim();
    }

    public static String stringSubstring(String x, int firstElement, int lengthOfSubstring) {
        if (x == null) throw new IllegalArgumentException("Input string is null");
        if (firstElement < 0 || lengthOfSubstring < 0 || firstElement + lengthOfSubstring > x.length()) {
            throw new IllegalArgumentException("Invalid start index or substring length");
        }
        return x.substring(firstElement, firstElement + lengthOfSubstring);
    }

    public static int searchChar(String userInputString, char charUserWants) {
        if (userInputString == null) return -1;
        return userInputString.indexOf(charUserWants);
    }

    public static String concatNames(String fName, String lName) {
        if (fName == null) fName = "";
        if (lName == null) lName = "";
        return fName.trim() + " " + lName.trim();
    }
}