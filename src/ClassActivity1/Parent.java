package ClassActivity1;

import java.util.ArrayList;

public class Parent {
    protected ArrayList<String> names;

    public Parent() {
        names = new ArrayList<>();
    }

    public void addName(String name) {
        names.add(name);
    }

    public void showNames() {
        System.out.println("Список имён: " + names);
    }
}
