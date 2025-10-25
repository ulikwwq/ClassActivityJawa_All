package ClassActivity2;

import java.util.ArrayList;

public class User {
    String username;
    ArrayList<String> messages;

    public User(String username) {
        this.username = username;
        this.messages = new ArrayList<>();
    }

    // Отправка сообщения
    public void sendMessage(String message) {
        messages.add(message);
    }

    // Печать всех сообщений пользователя
    public void printMessages() {
        System.out.println("Messages of " + username + ":");
        for (String msg : messages) {
            System.out.println(msg);
        }
        System.out.println();
    }

    // Фильтрация плохих слов
    public String filterMessage(String message) {
        // Заменяем плохие слова на **
        String filtered = message.replaceAll("f\\*ck|bi\\*ch", "**");
        return filtered;
    }

    // Анализ сообщения
    public void analyzeMessage(String message) {
        System.out.println("Analyzing message: " + message);
        System.out.println("Length: " + message.length());
        System.out.println("Word count: " + message.split(" ").length);
        if (!message.isEmpty() && Character.isUpperCase(message.charAt(0))) {
            System.out.println("Starts with a capital letter: Yes");
        } else {
            System.out.println("Starts with a capital letter: No");
        }
        System.out.println();
    }
}
