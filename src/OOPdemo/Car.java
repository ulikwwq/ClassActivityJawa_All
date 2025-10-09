package OOPdemo;

public class Car extends Transport {
    private int fuel; // private — уровень топлива

    public Car(String model, int speed, int fuel) {
        super(model, speed, "Машина");
        this.fuel = fuel;
    }

    @Override
    public void move() {
        System.out.println(model + " едет по дороге со скоростью " + getSpeed() + " км/ч");
    }

    @Override
    public void showInfo() {
        System.out.println("🚗 Машина: " + model + ", скорость: " + getSpeed() + " км/ч, топливо: " + fuel + "%");
    }
}
