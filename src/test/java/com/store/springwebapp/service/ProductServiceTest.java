package com.store.springwebapp.service;


import com.store.springwebapp.model.Manufacturer;
import com.store.springwebapp.model.Product;
import com.store.springwebapp.repository.ProductRepository;
import com.store.springwebapp.service.impl.ProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;


@RunWith(SpringRunner.class)
public class ProductServiceTest {

    @Mock
    ProductRepository productRepository;

    @Test
    public void findById() {
        ProductService productService = new ProductServiceImpl(productRepository);

        Product product = new Product();
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setName("Sony");
        product.setId(1L);
        product.setName("Tv");
        product.setCost(BigDecimal.valueOf(150));
        product.setCreatedDate(new Date());
        product.setManufacturer(manufacturer);
        product.setExpirationDate(new Date());

        productRepository.save(product);

        Product product1 = productService.findById(1l);

        //assertThat(product).isEqualTo(product1);

    }
}
