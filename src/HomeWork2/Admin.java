package ClassActivity2;

public class Admin extends User {

    public Admin(String username) {
        super(username); // вызываем конструктор родителя
    }

    // Переопределяем метод отправки сообщения
    @Override
    public void sendMessage(String message) {
        messages.add("ADMIN: " + message);
    }
}
