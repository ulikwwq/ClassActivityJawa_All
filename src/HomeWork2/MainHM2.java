package ClassActivity2;

import java.util.ArrayList;

public class MainHM2 {
    public static void main(String[] args) {
        // Создаем пользователей
        User u1 = new User("Alice");
        User u2 = new User("Bob");
        Admin a1 = new Admin("Moderator");

        // Создаем список пользователей
        ArrayList<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(a1);

        // Отправка сообщений
        u1.sendMessage("Hello everyone");
        u1.sendMessage("My name is Uluk");

        u2.sendMessage("This chat is bad but fun");
        u2.sendMessage("f*ck this problem");

        a1.sendMessage("Please follow the rules");
        a1.sendMessage("No bi*ching allowed");

        // Вывод сообщений и анализ
        for (User user : users) {
            user.printMessages();
            System.out.println("Filtered and analyzed messages:");
            for (String msg : user.messages) {
                String filtered = user.filterMessage(msg);
                user.analyzeMessage(filtered);
            }
            System.out.println("-------------------------------\n");
        }
    }
}
