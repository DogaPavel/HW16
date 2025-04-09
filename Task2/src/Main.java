import java.util.Scanner;

public class Main {
    private static final String NUMBER_REGEX = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    private static final String NUMBER_FORMAT = "+7 ($2) $3 $4-$5";
    private static final String SHORT_NUMBER_FORMAT = "+7 ($1) $2 $3-$4";

    public static void main(String[] args) {

        System.out.println("Введите номер телефона:");
        while (true) {
            String number = new Scanner(System.in).nextLine();
            number = number.replaceAll("\\D+", "");
            if (number.length() == 11) {
                number = number.replaceAll("(\\d)" + NUMBER_REGEX, NUMBER_FORMAT);
                System.out.println(number);
            } else if (number.length() == 10) {
                number = number.replaceAll(NUMBER_REGEX, SHORT_NUMBER_FORMAT);
                System.out.println(number);
            } else {
                System.out.println("Это не номер!!!");
            }
        }
    }
}