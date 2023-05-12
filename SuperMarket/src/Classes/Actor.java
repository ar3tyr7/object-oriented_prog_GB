package Classes;
// *Абстрактный класс покупателя Супермаркета, собирающий в себе основные хаарктеристики.
import Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {
    //Имя покупателя 
    protected String name;
    // 
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isTakeChekAndProducts;
    
    public Actor(String name) {
        this.name = name;
    }

    
    public abstract String getName(); 

}
