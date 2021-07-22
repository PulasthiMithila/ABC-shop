package com.springboot.demo.controller;

import com.springboot.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.jws.WebParam;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String showAllProducts(Model model){
        model.addAttribute("listProducts",productService.allProducts());
        //System.out.println(model);
        return "index";
    }
}
