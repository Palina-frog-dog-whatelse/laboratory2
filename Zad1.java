
import java.util.Scanner;
import java.util.regex.Pattern;
public class Zad1 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Pattern date = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");

            System.out.print("Введите дату: ");
            String input = scanner.nextLine();

            if (date.matcher(input).matches()) {
                String[] dateParts = input.split("/");
                int day = Integer.parseInt(dateParts[0]);
                int month = Integer.parseInt(dateParts[1]);
                int year = Integer.parseInt(dateParts[2]);

                if (isValidDate(day, month, year)) {
                    System.out.println("Введенное выражение является датой");
                } else {
                    System.out.println("Введенное выражение не является датой");
                }
            } else {
                System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
            }
        }

        private static boolean isValidDate(int day, int month, int year) {
            boolean has31Days = (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12);

            boolean has30Days = (month == 4 || month == 6 || month == 9 || month == 11);
            return (day >= 1 && day <= 31 && has31Days) ||
                    (day >= 1 && day <= 30 && has30Days) ;
        }
    }


