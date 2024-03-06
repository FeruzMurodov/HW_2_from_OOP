public class Human extends Actor{
    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "" +
                "Имя: " + name  +
                ", Заказ сделан: " + isMakeOrder +
                ", Заказ получен: " + isTakeOrder;
    }

    public Human(String name) {
        this.name = name;
        System.out.println("Клиент создан!");
    }
}
