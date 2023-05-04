public class Product {
    private double price;
    private ProductCategory category;

    public Product(double price, ProductCategory category) {
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", category=" + category +
                '}';
    }
}
/*
У каждого товара есть цена, наименование категория к которой он относится.
Важно, что после создания товара ни одно из его свойств не должно быть,
доступно для изменения, т.е. все поля должны быть private. Создать список товаров
 */
