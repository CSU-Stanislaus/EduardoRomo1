package D_Methods;

public class QuadraticSolver {
    public static void main(String[] args) {
        // t^2 + 6t - 16 = 0  -> a=1, b=6, c=-16
        double a = 1;
        double b = 6;
        double c = -16;

        double discriminant = b*b - 4*a*c;

        if (discriminant < 0) {
            System.out.println("No real roots.");
        } else if (discriminant == 0) {
            double t = -b / (2*a);
            System.out.println("One real root: t = " + t);
        } else {
            double sqrtD = Math.sqrt(discriminant);
            double t1 = (-b + sqrtD) / (2*a);
            double t2 = (-b - sqrtD) / (2*a);
            System.out.println("Two real roots:");
            System.out.println("t1 = " + t1);
            System.out.println("t2 = " + t2);
        }
    }

    public static class MethodsLab5 {

        public static void main(String[] args) {

            // ===========================
            // TEST YOUR METHODS HERE
            // Uncomment lines after writing each method
            // ===========================

            // Q1: square
            System.out.println("square(4) = " + square(4));
            System.out.println("square(10) = " + square(10));

            // Q2: average
            System.out.println("average(5, 10) = " + average(5, 10));
            System.out.println("average(7, 3) = " + average(7, 3));

            // Q3: greetPerson
            System.out.println(greetPerson("Liam", 20));
            System.out.println(greetPerson("Sophia", 35));

            // Q4: repeatWord
            System.out.println(repeatWord("Hi", 3));
            System.out.println(repeatWord("Java", 2));

            // Q5: absoluteValue
            System.out.println("absoluteValue(-5) = " + absoluteValue(-5));
            System.out.println("absoluteValue(12) = " + absoluteValue(12));
        }

        // Q1
        public static int square(int num) {
            return num * num;
        }

        // Q2
        public static double average(double a, double b) {
            return (a + b) / 2;
        }

        // Q3
        public static String greetPerson(String name, int age) {
            return "Hello, " + name + "! You are " + age + " years old.";
        }

        // Q4
        public static String repeatWord(String word, int count) {
            String result = "";
            for (int i = 0; i < count; i++) {
                result += word;
            }
            return result;
        }

        // Q5
        public static int absoluteValue(int n) {
            if (n < 0) {
                return -n;
            } else {
                return n;
            }
        }
    }
}

