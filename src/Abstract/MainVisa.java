class MainVisa {
    public static void main(String[] args) {
        AbstractCard visa = new AbstractCard("Улук Алиев", "4000 1234 5678 9999") {
            @Override
            void linkCard() {
                System.out.println("Карта Visa успешно привязана к вашему аккаунту!");
            }
        };

        visa.showInfo();
        visa.linkCard();
    }
}
