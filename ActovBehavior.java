/*Интерфейс ActorBehavoir, 
который будет содержать
описание возможных
действий актора в
очереди/магазин */

public interface ActovBehavior 
{
    void setMakeOrder();
    void setTakeOrder();
    boolean isMakeOrder();
    boolean isTakeOrder();

    
}
