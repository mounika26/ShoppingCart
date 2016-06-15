package com.niit.shoppingcart1.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart1.bean.Category;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart1.bean");
		context.refresh();
		Category c = (Category) context.getBean("category");
		c.setId(101);
		c.setName("A");
		c.setDescription("Hello");
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getDescription());

		/*if (c == null) {
			System.out.println("Unable to get Category Object");
		} 
		else {
			System.out.println("Category Object is created");
		}

	}*/
}
}
