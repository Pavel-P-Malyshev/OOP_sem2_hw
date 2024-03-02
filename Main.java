import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) 
    {
       Actor customer1=new Human("Alex");
       Actor customer2=new Human("Andgela");
       Actor customer3=new Human("Pavel");

       List<Actor> customers=new ArrayList<>();
       customers.add(customer1);
       customers.add(customer2);
       customers.add(customer3);

       
       /* если покупатель не сообщил что он хочет сделать - выдаем ему напоминание на каждом шаге 
       и не прелдоставляем сервис, для проверки закомментировать любой метод ниже */
       customer1.setTakeOrder(); 
       customer2.setMakeOrder();
       customer3.setTakeOrder();


        Market mkt1=new Market();

        mkt1.acceptToMarket(customer1);
        mkt1.acceptToMarket(customer2);
        mkt1.acceptToMarket(customer3);

        mkt1.takeInQueue(customer1);
        mkt1.takeInQueue(customer2);
        mkt1.takeInQueue(customer3);

        mkt1.update();

        mkt1.releaseFromQueue(customer1);
        mkt1.releaseFromQueue(customer2);
        mkt1.releaseFromQueue(customer3);

        mkt1.releaseFromMarkjet(customers);

       





    }
    
}
