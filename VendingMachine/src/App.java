import Products.BottleOfWater;
import Products.HotDrinks;
import Products.Product;
import VendingMachines.VendingMachine;

public class App {
        public static void main(String[] args) throws Exception {

            Product item1 = new Product("Cola", 88.0);
            item1.setPrice(98.0);

            VendingMachine itemMachin = new VendingMachine(300);
            itemMachin.addProduct(item1);
            itemMachin.addProduct(new Product("Чипсы", 60.0));
            itemMachin.addProduct(new Product("Масло", 50.0));
            itemMachin.addProduct(new Product("Хлеб", 40.0));
            itemMachin.addProduct(new Product("Снек", 20.0));
            itemMachin.addProduct(new BottleOfWater("Cola", 88.0, 500));
            itemMachin.addProduct(new BottleOfWater("Water", 188.0, 1500));
            itemMachin.addProduct(new HotDrinks("Зеленый чай", 32.0, 80));
            itemMachin.addProduct(new HotDrinks("Эспрессо",70.0, 100));
            itemMachin.addProduct(new HotDrinks("Капучино", 20.0, 100));

            for (Product prod : itemMachin.getProdAll()) {
                System.out.println(prod.toString());
            }

        }
    }

