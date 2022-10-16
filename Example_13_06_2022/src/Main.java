import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input month number");
        System.out.println(getMonthString(scanner.nextInt()));
        int num = scanner.nextInt();
        System.out.println(getMonthString(num));
        System.out.println(getSeason(num));
        System.out.println("How many articles you want to buy?");
        int count = scanner.nextInt();
        if (count > 0) {

        }
    }

    private static String getMonthString(int montNumber) {
        String answer;
        switch (montNumber) {
//            case 1 -> {
//                answer = "January";
//            } можно записать короче
            case 1:
                answer = "January";
                break;
            case 2:
                answer = "February";
                break;
            case 3:
                answer = "march";
                break;
            case 4:
                answer = "april";
                break;
            case 5:
                answer = "may";
                break;
            case 6:
                answer = "june";
                break;
            case 7:
                answer = "july";
                break;
            case 8:
                answer = "august";
                break;
            case 9:
                answer = "september";
                break;
            case 10:
                answer = "october";
                break;
            case 11:
                answer = "november";
                break;
            case 12:
                return "December";
            default:
                answer = "Illegal argument";
        }
        return answer;
    }

    private static String getSeason(int montNumber) {
        String answer;
        switch (montNumber) {
            // case 1:
            // case 2:
            // case 3:
                // answer = "Winter";
                // break;

            case 1, 2, 12:
                answer = "Winter";
                break;
            case 3, 4, 5:
                answer = "Spring";
                break;
            case 6, 7, 8:
                answer = "Summer";
                break;
            case 9, 10, 11:
                answer = "Autumn";
                break;
            default:
                answer = "Illegal argument";
        }
        return answer;
    }

}

