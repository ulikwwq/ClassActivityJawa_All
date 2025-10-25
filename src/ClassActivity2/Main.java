void main() {
    Scanner sc = new Scanner(System.in);
    Simple simple = new Simple(); // создаём объект Simple

    IO.print("Введите текст: ");
    String text = sc.nextLine();

    IO.print("Введите окончание (например, ing): ");
    String ending = sc.nextLine();

    simple.findWords(text, ending); // вызываем метод
}
