public class Main {

    public static void main(String[] args) {

        int n = 1;

        if (n < 7) {
            System.out.println("I am into first if");
        }

        if (n == 3) {
            System.out.println("I am here");

        }

        solutionTwoIf(1);
        extracted(n);
    }

    // 1 = Russian
    // 2 = English
    // default = Ukrainian
    public static void solutionTwoIf(int lang) {
        if (lang == 1) {
            System.out.println("User switched to Russian language");
        }

        if (lang == 2) {
            System.out.println("User switched to English language");
        }

    }

    private static void extracted(int n) {
        if (n == 1) {
            System.out.println("I am into nested if");
            if (n >= 4) {
                System.out.println("");
            } else {
                System.out.println("I am into else");
            }
        }
    }
}