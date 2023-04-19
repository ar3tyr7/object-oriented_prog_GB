package Products;

public class HotDrinks extends Product {
    private int temperature;

    public HotDrinks(String name, double price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + super.getName() + "'" +
                ", cost=" + super.getPrice() +
                ", temperature=" + temperature +
                '}';
    }

}
