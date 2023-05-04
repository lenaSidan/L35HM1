import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Product>products= new ArrayList<>();
        products.add(new Product("Bread",2.50,ProductCategory.PRODUCTS));
        products.add(new Product("Washing Machine",599,ProductCategory.ELECTRONICS));
        products.add(new Product("Coat", 150, ProductCategory.CLOTH));
        products.add(new Product("Bread",2.90,ProductCategory.PRODUCTS));

        Map<String, Double> namePriceMap = getProductPriceMap(products);
        System.out.println(namePriceMap);

    }
    public static Map<String, Double> getProductPriceMap(List<Product>products){
        Map<String, Double> namePriceMap = new HashMap<>();
        for (Product product:products){
            namePriceMap.put(product.getProductName(), product.getPrice());

        }
        return namePriceMap;
    }
}
/*
1
Допустим, у нас есть магазин.
В нашем магазине есть товары трех категорий: продукты, электроника, одежда.
У каждого товара есть цена, наименование категория к которой он относится.
Важно, что после создания товара ни одно из его свойств не должно быть,
доступно для изменения, т.е. все поля должны быть private. Создать список товаров

2
Реализуйте в main метод, который формирует Map<String,Double>
где ключ – наименование товара, значение – цена. Подсказка: видимо вам понадобятся гетеры.

3
Реализовать в классе Товар возможность изменения цены.
При этом система не должна давать возможность поставить отрицательную цену или 0
Видимо, понадобится сеттер. **НЕОБЯЗАТЕЛЬНОЕ.Добавить возможность вести истории изменения цены у товара.
 */