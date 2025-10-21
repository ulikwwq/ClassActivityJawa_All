import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Simple simple = new Simple(); // создаём объект Simple

        System.out.print("Введите текст: ");
        String text = sc.nextLine();

        System.out.print("Введите окончание (например, ing): ");
        String ending = sc.nextLine();

        simple.findWords(text, ending); // вызываем метод
    }
}
