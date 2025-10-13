package C_ControlStatements;

import java.util.Scanner;

public class ControlStatements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Control Statements Challenge ===");

        // 1) isEven (if/else)
        System.out.print("1) Enter an integer to test even/odd: ");
        int n1 = readInt(sc);
        System.out.println("   isEven? " + isEven(n1));

        // 2) maxOfTwo (if/else)
        System.out.print("2) Enter two integers (a then b) to find the max:\n   a = ");
        int a = readInt(sc);
        System.out.print("   b = ");
        int b = readInt(sc);
        System.out.println("   max: " + maxOfTwo(a, b));

        // 3) gradeLetter (if/else-if ladder)
        System.out.print("3) Enter a score (0-100) to get letter grade: ");
        int score = readInt(sc);
        System.out.println("   letter grade: " + gradeLetter(score));

        // 4) fizzBuzzOne (if/else with %)
        System.out.print("4) Enter an integer for FizzBuzz (single value): ");
        int fb = readInt(sc);
        System.out.println("   result: " + fizzBuzzOne(fb));

        // 5) sum1toN (for loop)
        System.out.print("5) Enter n to sum from 1..n: ");
        int n = readInt(sc);
        System.out.println("   sum 1..n: " + sum1toN(n));

        // 6) factorial (while loop)
        System.out.print("6) Enter n to compute n! (while loop): ");
        int nf = readInt(sc);
        System.out.println("   n! = " + factorial(nf));

        // 7) reverseString (for loop over indices)
        System.out.print("7) Enter text to reverse: ");
        String toReverse = sc.nextLine();
        System.out.println("   reversed: " + reverseString(toReverse));

        // 8) countVowels (loop + continue)
        System.out.print("8) Enter text to count vowels: ");
        String vowelStr = sc.nextLine();
        System.out.println("   vowel count: " + countVowels(vowelStr));

        // 9) multiplicationTable (nested loops; return as multi-line string)
        System.out.print("9) Enter an integer for its 1..10 multiplication table: ");
        int mt = readInt(sc);
        System.out.println(multiplicationTable(mt));

        // 10) dayNameSwitch (switch)
        System.out.print("10) Enter a number 1-7 (1=Mon ... 7=Sun): ");
        int dayNum = readInt(sc);
        System.out.println("   day: " + dayNameSwitch(dayNum));

        System.out.println("=== Done. Now implement the TODOs! ===");
        sc.close();
    }

    // Helper: robust integer reader reused from your style
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

    // 1
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 2
    public static int maxOfTwo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // 3
    public static String gradeLetter(int score) {
        if (score < 0 || score > 100) {
            return "INVALID";
        } else if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // 4
    public static String fizzBuzzOne(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(n);
        }
    }

    // 5
    public static int sum1toN(int n) {
        if (n < 1) return 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // 6
    public static long factorial(int n) {
        if (n < 0) return -1;
        long result = 1;
        while (n > 0) {
            result *= n;
            n--;
        }
        return result;
    }

    // 7
    public static String reverseString(String s) {
        if (s == null) return null;
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    // 8
    public static int countVowels(String s) {
        if (s == null) return 0;
        int count = 0;
        String lower = s.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                continue;
            }
            count++;
        }
        return count;
    }

    // 9
    public static String multiplicationTable(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(n).append(" x ").append(i).append(" = ").append(n * i).append("\n");
        }
        return sb.toString();
    }

    // 10
    public static String dayNameSwitch(int dayNumber) {
        switch (dayNumber) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "INVALID";
        }
    }
}