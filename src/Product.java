import java.util.ArrayList;
import java.util.List;

public class Product {
    private  String productName;
    private double price;
    private ProductCategory category;
    private List<Double> priceHistory;

    public Product(String productName, double price, ProductCategory category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.priceHistory = new ArrayList<>();
        this.priceHistory.add(price);
    }

    @Override
    public String toString() {
        return "\nProduct Name: " +productName+ " Product price = " + price +" €"+", category: " + category;
    }
    public String getProductName(){
        return "\nProduct Name: " +productName;
    }
    public void setProductName(String productName){
        this.productName= productName;
    }
    public double getPrice(){
        return price;
    }
    public boolean setPrice(double newPrice){
        if (newPrice<=0){
            this.priceHistory.add(newPrice);
            this.price = newPrice;
            return true;
        }else {
            return false;
        }
    }

    public List<Double> getPriceHistory() {
        return priceHistory;
    }
}
/*
У каждого товара есть цена, наименование категория к которой он относится.
Важно, что после создания товара ни одно из его свойств не должно быть,
доступно для изменения, т.е. все поля должны быть private. Создать список товаров.

Реализовать в классе Товар возможность изменения цены.
При этом система не должна давать возможность поставить отрицательную цену или 0
Видимо, понадобится сеттер. **НЕОБЯЗАТЕЛЬНОЕ.Добавить возможность вести истории изменения цены у товара.
 */
