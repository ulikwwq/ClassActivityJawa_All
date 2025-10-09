package OOPdemo;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car("Toyota Camry", 120, 80);
        Transport bike = new Bicycle("Stels", 25, true);

        // Демонстрация полиморфизма
        Transport[] transports = {car, bike};

        for (Transport t : transports) {
            t.showInfo();  // вызовет свой вариант метода
            t.move();      // вызовет свой вариант метода
            System.out.println();
        }

        // Проверим инкапсуляцию — изменим скорость через setter
        car.setSpeed(150);
        System.out.println("После изменения скорости:");
        car.showInfo();

        // Проверим отрицательное значение (инкапсуляция защитит)
        bike.setSpeed(-10);
    }
}
