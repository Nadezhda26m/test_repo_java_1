import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
    }
}