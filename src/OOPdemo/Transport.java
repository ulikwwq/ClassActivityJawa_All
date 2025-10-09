package OOPdemo;

public class Transport {
    private int speed;           // private — доступ только внутри класса
    protected String model;      // protected — доступен в наследниках
    public String type;          // public — доступен всем

    public Transport(String model, int speed, String type) {
        this.model = model;
        setSpeed(speed);
        this.type = type;
    }

    // Инкапсуляция: управление доступом к полям
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Скорость не может быть отрицательной!");
        }
    }

    public void move() {
        System.out.println("Транспорт движется...");
    }

    public void showInfo() {
        System.out.println(type + " — модель: " + model + ", скорость: " + speed + " км/ч");
    }
}

