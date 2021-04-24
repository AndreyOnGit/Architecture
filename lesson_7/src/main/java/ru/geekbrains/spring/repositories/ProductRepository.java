package ru.geekbrains.spring.repositories;

import org.springframework.stereotype.Component;
import ru.geekbrains.spring.models.Product;

import javax.annotation.PostConstruct;
import java.util.*;

@Component
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new LinkedList<>();
        products.add(new Product(1l, "book", 10d));
        products.add(new Product(2l, "pen", 2d));
        products.add(new Product(3l, "notebook", 3d));
        products.add(new Product(4l, "pencil", 1.5d));
        products.add(new Product(5l, "ruler", 2.35d));
    }

    public List<Product> getAll() {
        return Collections.unmodifiableList(products);
    }

    public boolean add(Product product) {
        long newId = products.stream().mapToLong(Product::getId).max().orElseGet(() -> 0l) + 1l;
        product.setId(newId);
        if (products.add(product)) return true;
        return false;
    }

    public boolean setChanging(Product product) {
        for (Product p : products) {
            if (product.getId() == p.getId()) {
//                products.set(products.indexOf(p), product); //получается 2-ой цикл в части поиска индекса
                p.setCost(product.getCost());
                p.setTitle(product.getTitle());
                return true;
            }
        }
        return false;
    }

    public Optional<Product> getById(long id) {
        return products.stream().filter(p -> p.getId() == id).findFirst();
    }

    public boolean removeById(long id) {
//        for (Product product : products) {
//            if (id == product.getId()) {
//                products.remove(product); // некультурно, правильнее через Iterator
//                return true;
//            }
//        }
         return products.removeIf(p -> p.getId() == id);
    }
}
