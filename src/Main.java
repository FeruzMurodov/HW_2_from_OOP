public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human client1 = new Human("Иосиф");
        Human client2 = new Human("Авраам");
        Human client3 = new Human("Адам");
        System.out.println(client1.getName());
        System.out.println(client2.getName());
        System.out.println(client3.getName());
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        System.out.println(market);
        market.takeOrders();           //получения заказа по очереди
        market.takeOrders();           //получения заказа по очереди
        market.giveOrders();           //обслужевание по очереди
        market.releaseFromMarket(market.queue);   //проверено что обслуживан и удалён из очереди
        market.releaseFromMarket(market.queue);   //проверено что обслуживан и не удалён из очереди
        market.update();
    }
}