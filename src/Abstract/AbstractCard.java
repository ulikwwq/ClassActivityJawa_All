abstract class AbstractCard {
    String cardHolder;
    String cardNumber;

    public AbstractCard(String cardHolder, String cardNumber) {
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
    }

    // Абстрактный метод — у каждой карты своя реализация
    abstract void linkCard();

    // Обычный метод — общий для всех
    void showInfo() {
        System.out.println("Владелец карты: " + cardHolder);
        System.out.println("Номер карты: " + cardNumber);
    }
}
