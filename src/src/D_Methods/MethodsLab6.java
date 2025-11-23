package src.D_Methods;

public class MethodsLab6 {

    public static void main(String[] args) {

        // ===========================
        // TEST YOUR METHODS HERE
        // ===========================

        // Q1: isAdult
        System.out.println("isAdult(17) = " + isAdult(17)); // false
        System.out.println("isAdult(18) = " + isAdult(18)); // true
        System.out.println("isAdult(25) = " + isAdult(25)); // true

        // Q2: formatMoney
        System.out.println(formatMoney("Alice", 12.5));
        System.out.println(formatMoney("Bob", 100.0));

        // Q3: areaOfRectangle
        System.out.println("areaOfRectangle(5, 4) = " + areaOfRectangle(5, 4));
        System.out.println("areaOfRectangle(10, 2) = " + areaOfRectangle(10, 2));

        // Q4: firstChar
        System.out.println("firstChar(\"hello\") = " + firstChar("hello"));
        System.out.println("firstChar(\"Java\") = " + firstChar("Java"));

        // Q5: toCelsius
        System.out.println("toCelsius(32) = " + toCelsius(32.0));
        System.out.println("toCelsius(98.6) = " + toCelsius(98.6));
    }


    // Q1
    public static boolean isAdult(int age) {
        return age >= 18;
    }

    // Q2
    public static String formatMoney(String name, double amount) {
        return name + " has $" + amount;
    }

    // Q3
    public static int areaOfRectangle(int width, int height) {
        return width * height;
    }

    // Q4
    public static char firstChar(String text) {
        return text.charAt(0);
    }

    // Q5
    public static double toCelsius(double f) {
        return (f - 32) * 5.0 / 9.0;
    }
}