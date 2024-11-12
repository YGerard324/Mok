package com.example.applications.appications;
import com.example.applications.ProductApplication;
import com.example.entities.Product;
import com.example.services.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class ApplicationTest {

    @InjectMocks
    private ProductApplication productApplication;

    @Mock
    private ProductService productService;


    @Test
    public void ProductApplicationShouldSaveTheImage(){
        Product product = any(Product.class);
        productApplication.append(product);
        Mockito.verify(productService, Mockito.times(1)).save(product);
    }

    @Test
    public void ProductApplicationShouldDeleteTheImage(){
        Product product = any(Product.class);
        productApplication.remove(1);
        Mockito.verify(productService, Mockito.times(1)).remove(1);
    }

    @Test
    public void ProductApplicationShouldUpdateTheImage(){
        Product product = any(Product.class);
        productApplication.update(1, product);
        Mockito.verify(productService, Mockito.times(1)).update(product);
    }

}
