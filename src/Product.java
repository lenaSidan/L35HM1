public class Product {
    private final String productName;
    private double price;
    private ProductCategory category;
    private double priceHistory;

    public Product(String productName, double price, ProductCategory category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.priceHistory = price;
    }

    @Override
    public String toString() {
        return "Product Name: " +productName+ " Product price = " + price +" €"+", category: " + category;
    }
    public String getProductName(){
        return "\nProduct Name: " +productName;
    }
    public void setProductName(){
        //this.productName= productName;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        if (price<=0){
            this.priceHistory=this.priceHistory+1;
            this.price=price-1;
        }

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
