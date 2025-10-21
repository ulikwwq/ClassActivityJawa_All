import java.util.regex.*;
import java.util.*;

public class Simple {

    // Метод, который находит слова по окончанию
    public void findWords(String text, String ending) {
        Pattern pattern = Pattern.compile("\\b\\w*" + ending + "\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Слова, заканчивающиеся на \"" + ending + "\":");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
