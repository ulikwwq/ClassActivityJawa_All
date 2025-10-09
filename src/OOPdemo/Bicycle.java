package OOPdemo;

public class Bicycle extends Transport {
    private boolean hasBell;

    public Bicycle(String model, int speed, boolean hasBell) {
        super(model, speed, "Велосипед");
        this.hasBell = hasBell;
    }

    @Override
    public void move() {
        System.out.println(model + " крутит педали со скоростью " + getSpeed() + " км/ч");
    }

    @Override
    public void showInfo() {
        System.out.println("🚲 Велосипед: " + model + ", скорость: " + getSpeed() + " км/ч, звонок: " + (hasBell ? "есть" : "нет"));
    }
}

