package ClassActivity1;

public class Child extends Parent {

    @Override // ← говорит компилятору, что мы переопределяем метод родителя
    public void showNames() {
        System.out.println("Список родительских имён: " + names);
    }

    public void printFirstName() {
        if (!names.isEmpty()) {
            System.out.println("Первое имя: " + names.get(1));
        } else {
            System.out.println("Список пуст!");
        }
    }
}

