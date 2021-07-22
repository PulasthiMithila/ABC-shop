package com.springboot.demo;

import com.springboot.demo.model.Product;
import com.springboot.demo.service.ProductService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;

@SpringBootTest
class AbcInventoryApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Autowired
	private ProductService productService;

	@Test
	public void testFindAll(){
		Collection<Product> list=productService.allProducts();
		Assert.assertNotNull("failure - expected not null", list);
		Assert.assertEquals("failure expected size",6,list.size());
	}
}
