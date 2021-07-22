package com.springboot.demo.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.demo.model.Product;
//import jdk.internal.org.objectweb.asm.TypeReference;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    // get saved data in a json file
    public List<Product> allProducts() {

        List<Product> products=new ArrayList<Product>();
        //System.out.println("service running");

        ObjectMapper mapper=new ObjectMapper();
        TypeReference<List<Product>> typeReference=new TypeReference <List<Product>>(){};

        InputStream inputStream=TypeReference.class.getResourceAsStream("/productInventory.json");


        try{
             products=mapper.readValue(inputStream,typeReference);
             //System.out.println(products.toString());
        }catch (IOException e){
            System.out.println("Unable to show product "+e.getMessage());

        }
        return products;
    }
}
