import ClassActivity1.Child;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();

        child.addName("Улук");
        child.addName("Айдана");
        child.addName("Бектур");

        child.showNames();
        child.printFirstName();
    }
}
