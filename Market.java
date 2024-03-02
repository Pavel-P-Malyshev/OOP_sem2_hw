/*Реализовать класс Market и все методы, которые он обязан реализовывать.
Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour 
– помещает и удаляет человека из очереди, метод update – обновляет состояние магазина (принимает и отдаёт заказы)


Реализовать класс Market ивсе методы, которые онобязан реализовывать. 
Методы из интерфейса QueueBehaviour, имитируют работу очереди, 
MarketBehaviour – помещает и удаляет человека из очереди, 
метод update – обновляетnсостояние магазина (принимает и отдает заказы)


Формат сдачи: ссылка на гитхаб проект 
*/

/*Класс Market, который реализовывает два
вышеуказанных интерфейса и хранит в списке
список людей в очереди в различных статусах */
import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehavior, MarketBehaviour
{
    private List<Actor> consumers=new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor)
    {
        consumers.add(actor);
    }

    @Override
    public void takeInQueue(Actor actor)
    {
       String serviceType = "What can we do for you? pls tell us your service type";
       if (actor.isTakeOrder&&actor.isMakeOrder){serviceType="Applying and taking orders";}
       if (actor.isTakeOrder){serviceType="Taking orders";}
       if (actor.isMakeOrder){serviceType="Applying orders";}
       
       
       if (actor.isTakeOrder||actor.isMakeOrder){
        System.out.println(actor.getName()+" : "+"You are in the waiting list for - " + serviceType +" - service, please wait some time!");
         }
 
          else {
             System.out.println(actor.getName()+" : "+serviceType);
          }

    }

    @Override
    public void takeOrders()
    {
        boolean noservice=false;

        for (Actor consumer : consumers) 
        {
           if (consumer.isTakeOrder){
            System.out.println(consumer.getName()+" :" + "Take your order now please!");
           }

           if ((!consumer.isMakeOrder)&&(!consumer.isTakeOrder)){
            noservice=true;
            System.out.println(consumer.getName()+" :" + "You havent told us your service type!");
           }

        }

        //if(noservice) {System.out.println(consumer.getName()+" :" + "You havent told us your service type!");}
    }

    @Override
    public void giveOrders()
    {
        boolean noservice=false;

        for (Actor consumer : consumers) 
        {
           if (consumer.isMakeOrder){
            System.out.println(consumer.getName()+" :" + "Apply your order now please!");
           }

           if ((!consumer.isMakeOrder)&&(!consumer.isTakeOrder)){
            noservice=true;
            System.out.println(consumer.getName()+" :" + "You havent told us your service type!");
           }
          
        }

       // if(noservice) {System.out.println("You havent told us your service type!");}
    }

    @Override
    public void update(){
        this.takeOrders();
        this.giveOrders();
    }

    @Override
    public void releaseFromQueue(Actor actor){
        
        String serviceType = "What can we do for you? pls tell us your service type";
       if (actor.isTakeOrder&&actor.isMakeOrder){serviceType="Applying and taking orders";}
       if (actor.isTakeOrder){serviceType="Taking orders";}
       if (actor.isMakeOrder){serviceType="Applying orders";}
       
        if (actor.isTakeOrder||actor.isMakeOrder){
       System.out.println(actor.getName()+" : "+"Service - " + serviceType + " - has been provided, we look forward to see you again!");
        }

         else {
            System.out.println(actor.getName()+" : "+serviceType);
         }

    }
  


    @Override
    public void releaseFromMarkjet(List<Actor> actors)
    {
        for (Actor consumer : actors) 
        {
            consumers.remove(consumer);
        }
    }

}
