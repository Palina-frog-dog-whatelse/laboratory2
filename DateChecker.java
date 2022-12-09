import java.util.regex.*;
import java.util.Scanner;

public class DateChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;


            System.out.println("Введите пароль: ");
            password = sc.nextLine();

            if (password.length() < 8||!Pattern.matches("^[0-9a-zA-Z_]+$", password)||!Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).*$", password)) {
                System.out.println("Пароль ненадежен. Повторите ввод");
            }
         while (password.length() < 8 || !Pattern.matches("^[0-9a-zA-Z_]+$", password) || !Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).*$", password));

        System.out.println("Ваш пароль надежный.");
    }
}
