package com.productapp.controller;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.productapp.dao.Product;
import com.productapp.service.ProductService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class ProductControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void givenProductObject_whenCreateProduct_thenReturnSavedProduct() throws Exception{

        // given - precondition or setup
        Product product=new Product("laptop", BigDecimal.valueOf(120000));
        given(productService.addProduct(any(Product.class)))
                .willAnswer((invocation)-> invocation.getArgument(0));

        // when - action or behaviour that we are going test
        ResultActions response = mockMvc.perform(post("/products")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(product)));

        // then - verify the result or output using assert statements
        response.andDo(print()).
                andExpect(status().isCreated())
                .andExpect(jsonPath("$.name",
                        is(product.getName())))
                .andExpect(jsonPath("$.price",
                        is(product.getPrice().intValue())));
    }
    @Test
    public void givenListOfProducts_whenGetAllProducts_thenReturnProductList() throws Exception{
        // given - precondition or setup
        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(Product.builder().name("a").price(BigDecimal.valueOf(120000)).build());
        listOfProducts.add(Product.builder().name("b").price(BigDecimal.valueOf(120000)).build());
        given(productService.getAll()).willReturn(listOfProducts);

        // when -  action or the behaviour that we are going test
        ResultActions response = mockMvc.perform(get("/products"));

        // then - verify the output
        response.andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$.size()",
                        is(listOfProducts.size())));

    }

    // positive scenario - valid employee id
    @Test
    public void givenProductId_whenGetProductById_thenReturnProductObject() throws Exception{
        // given - precondition or setup
        int productId = 1;
        Product product=new Product(1,"laptop", BigDecimal.valueOf(120000));
        given(productService.getProductById(productId)).willReturn(product);

        // when -  action or the behaviour that we are going test
        ResultActions response = mockMvc.perform(get("/products/{id}", productId));

        // then - verify the output
        response.andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$.name", is(product.getName())))
                .andExpect(jsonPath("$.price", is(product.getPrice().intValue())));

    }


    // @Test
    public void givenInvalidProductId_whenGetProductById_thenReturnEmpty() throws Exception{
        // given - precondition or setup
        int productId = 1;
        Product product=new Product(1,"laptop", BigDecimal.valueOf(120000));
        given(productService.getProductById(productId)).willReturn(null);

        // when -  action or the behaviour that we are going test
        ResultActions response = mockMvc.perform(get("/products/{id}", productId));

        // then - verify the output
        response.andExpect(status().isNotFound())
                .andDo(print());

    }

}