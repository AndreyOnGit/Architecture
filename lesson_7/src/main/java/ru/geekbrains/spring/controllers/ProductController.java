package ru.geekbrains.spring.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.spring.models.Product;
import ru.geekbrains.spring.services.ProductService;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public String showAll(Model model,
                          @RequestParam(required = false, name = "minCost") Double minCost,
                          @RequestParam(required = false, name = "maxCost") Double maxCost,
                          @RequestParam(required = false, name = "id") Long id) {
        model.addAttribute("products", productService.getAll(minCost, maxCost, id));
        return "products";
    }

    @GetMapping("/remove/{id}")
    public String remove(@PathVariable long id) {
        productService.removeById(id);
        return "redirect:/products";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Product product) {
        productService.save(product);
        return "redirect:/products";
    }


}
