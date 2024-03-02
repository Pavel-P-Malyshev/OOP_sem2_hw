/*Абстрактный класс Actor, 
который хранит в себе
параметры актора, включая
состояние готовности сделать
заказ и факт получения
заказа. Дополнение: для большего понимания, можно сделать методы-геттеры для имени и прочих
“персональных данных” abstrac */

public abstract class Actor implements ActovBehavior
{
    protected String name;
    protected boolean isMakeOrder=false;
    protected boolean isTakeOrder=false;
     
    public Actor(String name){
        this.name=name;
    }

    public String getName()
    {
       return this.name;
    }

     
   
    
}
