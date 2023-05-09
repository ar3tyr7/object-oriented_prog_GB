package Classes;

public class PromotionalClient extends Actor{
    protected String dicountName;
    protected static int idDiscounter = 0;
    public PromotionalClient (String name, String dicountName, int idDiscounter){
        super(name);
        idDiscounter++;
        this.dicountName = dicountName;
    }
    public String getDicountName (){
        return dicountName;
    }
    public void setDiscountName (String dicountName){
        this.dicountName=dicountName;
    }
    public int getidDiscounter (){
        return PromotionalClient.idDiscounter;
    }
    public void setIdDiscounter(int newIdDiscounter) {
        PromotionalClient.idDiscounter = newIdDiscounter;
    }
    @Override
    public String getName(){
        return super.name;
    }
    @Override
    public boolean isMakeOrder(){
        return super.isMakeOrder;
    }
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder=makeOrder;
    }
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    @Override
    public Actor getActor() {
        return this;
    }

}