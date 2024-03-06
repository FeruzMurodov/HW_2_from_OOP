import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour{

    LinkedList<Actor> queue = new LinkedList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        if (actors.getFirst().isTakeOrder){
            queue.pop();
            releaseFromQueue();
        }
    }

    @Override
    public void update() {
        System.out.println(queue);
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        String name = actor.name;
        System.out.println("Клиент "+ name+ " принят на очередь!");
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue){
            if (!actor.isMakeOrder){
                actor.setMakeOrder();
                System.out.println("Заказ принят!");
                break;
            }
        }

    }

    @Override
    public void giveOrders() {
        queue.getFirst().setTakeOrder();
        System.out.println("Заказ отдан!");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println("Клиент удалён из очереди!");
    }

    @Override
    public String toString() {
        return  queue.toString();
    }
}
