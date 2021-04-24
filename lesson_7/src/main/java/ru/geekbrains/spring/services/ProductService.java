package ru.geekbrains.spring.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.spring.models.Product;
import ru.geekbrains.spring.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Optional<Product> getById(long id) {
        return productRepository.getById(id);
    }

    public List<Product> getAll(Double minCost, Double maxCost, Long id) {
        List<Product> products = productRepository.getAll();
        if (minCost != null)
            products = products.stream().filter(p -> p.getCost() >= minCost).collect(Collectors.toList());
        if (maxCost != null)
            products = products.stream().filter(p -> p.getCost() <= maxCost).collect(Collectors.toList());
        if (id != null)
            products = products.stream().filter(p -> p.getId() == id).collect(Collectors.toList());
        return products;
    }

    public void save(Product product) {
        if (!getById(product.getId()).isEmpty()) productRepository.setChanging(product);
        else productRepository.add(product);
    }

    public boolean removeById(long id) {
        if (productRepository.removeById(id)) return true;
        else return false;
    }

}
