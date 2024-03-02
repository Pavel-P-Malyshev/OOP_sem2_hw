/* Интерфейс QueueBehaviour, который описывает
логику очереди – помещение в/освобождение из
очереди, принятие/отдача заказа */


public interface QueueBehavior 
{
    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue(Actor actor);
    
}
