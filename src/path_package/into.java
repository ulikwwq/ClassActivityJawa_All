package path_package;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class into {
    public static void main(String[] args) {
        Path path = Paths.get("src/path_package/test");
        try {
            // если файла нет — создаём
            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("Файл создан: " + path.toAbsolutePath());
            }

            // добавляем текст в конец файла
            String newText = "\nЭто новый текст, добавленный через Java!";
            Files.writeString(path, newText, StandardOpenOption.APPEND);

            System.out.println("Текст успешно добавлен!");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
