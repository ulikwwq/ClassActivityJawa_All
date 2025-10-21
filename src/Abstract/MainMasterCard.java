class MainMasterCard {
    public static void main(String[] args) {
        AbstractCard master = new AbstractCard("Улук Алиев", "5100 4321 8765 1111") {
            @Override
            void linkCard() {
                System.out.println("Карта MasterCard успешно привязана к вашему аккаунту!");
            }
        };

        master.showInfo();
        master.linkCard();
    }
}
