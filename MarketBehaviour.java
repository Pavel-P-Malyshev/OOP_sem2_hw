/*Интерфейс MarketBehaviour, который описывает
логику магазина – приход/уход покупателей, 
обновление состояния магазина */
import java.util.List;

public interface MarketBehaviour 
{
   void acceptToMarket(Actor actor);
   void releaseFromMarkjet(List<Actor> actors);
   void update();
    
}
