public class Product {
    private String productName;
    private double price;
    private ProductCategory category;

    public Product(String productName, double price, ProductCategory category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product Name: " +productName+ " Product price = " + price +" €"+", category: " + category;
    }
    private String getProductName(){
        return productName;
    }
    private double getPrice(){
        return price;
    }
}
/*
У каждого товара есть цена, наименование категория к которой он относится.
Важно, что после создания товара ни одно из его свойств не должно быть,
доступно для изменения, т.е. все поля должны быть private. Создать список товаров
 */
