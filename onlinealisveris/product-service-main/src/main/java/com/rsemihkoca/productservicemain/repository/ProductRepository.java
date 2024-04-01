package com.rsemihkoca.productservicemain.repository;

import com.rsemihkoca.productservicemain.model.Product;
import com.rsemihkoca.productservicemain.model.enums.Category;
import com.rsemihkoca.productservicemain.model.type.NonNegativeIntegerType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Repository
public class ProductRepository {

    private final List<Product> productList = new ArrayList<>();

    public Product save(Product product) {
        productList.add(product);
        return product;
    }

    public Product delete(Product product) {
        productList.remove(product);
        return product;
    }

    public Product getById(String id) {
        return productList.stream()
                .filter(product -> product.getProductId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Product> getAll() {
        return productList;
    }

    public void initializeDatabase() {

        productList.add(new Product("P001", "Apple", 1.00, new NonNegativeIntegerType(100), Category.FOOD));
        productList.add(new Product("P002", "Milk", 2.50, new NonNegativeIntegerType(50), Category.FOOD));
        productList.add(new Product("P003", "Cola", 1.50, new NonNegativeIntegerType(75), Category.DRINK));
        productList.add(new Product("P004", "Laptop", 800.00, new NonNegativeIntegerType(20), Category.ELECTRONIC));
        productList.add(new Product("P005", "Java Programming Book", 40.00, new NonNegativeIntegerType(30), Category.BOOK));
        productList.add(new Product("P006", "T-shirt", 15.00, new NonNegativeIntegerType(50), Category.CLOTHING));
        productList.add(new Product("P007", "Office Chair", 100.00, new NonNegativeIntegerType(10), Category.OFFICE));
        productList.add(new Product("P008", "Banana", 0.50, new NonNegativeIntegerType(150), Category.FOOD));
        productList.add(new Product("P009", "Orange Juice", 3.00, new NonNegativeIntegerType(40), Category.DRINK));
        productList.add(new Product("P010", "Smartphone", 600.00, new NonNegativeIntegerType(30), Category.ELECTRONIC));
        productList.add(new Product("P011", "Harry Potter Book Set", 100.00, new NonNegativeIntegerType(15), Category.BOOK));
        productList.add(new Product("P012", "Jeans", 50.00, new NonNegativeIntegerType(25), Category.CLOTHING));
        productList.add(new Product("P013", "Printer", 150.00, new NonNegativeIntegerType(5), Category.OFFICE));
        productList.add(new Product("P014", "Pizza", 10.00, new NonNegativeIntegerType(50), Category.FOOD));
        productList.add(new Product("P015", "Bottled Water", 1.00, new NonNegativeIntegerType(100), Category.DRINK));
        productList.add(new Product("P016", "Smartwatch", 200.00, new NonNegativeIntegerType(20), Category.ELECTRONIC));
        productList.add(new Product("P017", "The Great Gatsby Book", 15.00, new NonNegativeIntegerType(40), Category.BOOK));
        productList.add(new Product("P018", "Hoodie", 35.00, new NonNegativeIntegerType(30), Category.CLOTHING));
        productList.add(new Product("P019", "Desk", 120.00, new NonNegativeIntegerType(10), Category.OFFICE));
        productList.add(new Product("P020", "Sushi", 12.00, new NonNegativeIntegerType(30), Category.FOOD));
        productList.add(new Product("P021", "Tea", 3.50, new NonNegativeIntegerType(60), Category.DRINK));
        productList.add(new Product("P022", "Headphones", 80.00, new NonNegativeIntegerType(40), Category.ELECTRONIC));
        productList.add(new Product("P023", "To Kill a Mockingbird Book", 20.00, new NonNegativeIntegerType(25), Category.BOOK));
        productList.add(new Product("P024", "Dress Shirt", 45.00, new NonNegativeIntegerType(20), Category.CLOTHING));
        productList.add(new Product("P025", "Whiteboard", 50.00, new NonNegativeIntegerType(15), Category.OFFICE));

    }
}
