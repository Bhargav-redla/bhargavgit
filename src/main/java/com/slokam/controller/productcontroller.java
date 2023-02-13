package com.slokam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.product1;
import com.slokam.repository.productrepo;

@RestController
public class productcontroller {
	//hi how are you?
	@Autowired
private productrepo Productrepo;
@PostMapping("saveproduct")
public product1 save(@RequestBody product1 Product) {
product1 pro=	Productrepo.save(Product);
System.out.println(Product);
return pro;


}
}
