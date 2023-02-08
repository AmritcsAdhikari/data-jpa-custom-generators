package com.app.amrit.runner;

import com.app.amrit.entity.Product;
import com.app.amrit.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("*****Runner Execution Started ****");
        Product p1 = new Product();
        p1.setProdName("iPhone-14");
        p1.setProdPrice(1400.00);

        Product p2 = new Product();
        p2.setProdName("Google Pixel -6");
        p2.setProdPrice(1700.00);

        Product p = productRepository.save(p1);
        Product pr = productRepository.save(p2);

        System.out.println(p.getProdId());
        System.out.println(pr.getProdId());
    }
}
