package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.BillingaddressDao;
import com.niit.dao.CartDao;
import com.niit.dao.CategoryDao;
import com.niit.dao.ProductDao;
import com.niit.dao.RoleDao;
import com.niit.dao.ShippingaddressDao;
import com.niit.dao.SupplierDao;
import com.niit.dao.UserDao;
import com.niit.dao.WishlistDao;
import com.niit.model.Billingaddress;
import com.niit.model.Cart;
import com.niit.model.Category;
import com.niit.model.User;
import com.niit.model.Wishlist;
import com.niit.model.Product;
import com.niit.model.Role;
import com.niit.model.Shippingaddress;
import com.niit.model.Supplier;

public class Test {

	private static Cart productid;

	public static void main (String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();

		CategoryDao categoryDAO = (CategoryDao) context.getBean("CategoryDao");
		UserDao userDAO = (UserDao) context.getBean("UserDao");
		ProductDao productDAO = (ProductDao) context.getBean("ProductDao");
		BillingaddressDao billingaddressDAO = (BillingaddressDao) context.getBean("BillingaddressDao");
		CartDao cartDAO = (CartDao) context.getBean("CartDao");
		SupplierDao supplierDAO = (SupplierDao) context.getBean("SupplierDao");
		WishlistDao wishlistDAO = (WishlistDao) context.getBean("WishlistDao");
		ShippingaddressDao shippingaddressDAO = (ShippingaddressDao) context.getBean("ShippingaddressDao");
		RoleDao roleDAO = (RoleDao) context.getBean("RoleDao");
		
		Category category = (Category) context.getBean("category");
		User user = (User) context.getBean("user");
		Product product = (Product) context.getBean("product");
		Billingaddress billingaddress = (Billingaddress) context.getBean("billingaddress");
		Cart cart = (Cart) context.getBean("cart");
		Supplier supplier = (Supplier) context.getBean("supplier");
		Wishlist whishlist = (Wishlist) context.getBean("wishlist");
		Shippingaddress shippingaddress = (Shippingaddress) context.getBean("shippingaddress");
		Role role = (Role) context.getBean("role");
		
		
category.setCategoryName("Watches");
		
		categoryDAO.saveOrUpdate(category);
		
		
		user.setUname("skfr");
		user.setEmail("jhvd@gmail.com");
		user.setPwd("jfkd");
		
		


		role.setUserName("kjgdffd");
		role.setEmailId("hgfshdghj");
		role.setContactNumber(6567);
		
		user.setRole(role);
		role.setUser(user);
		
		userDAO.saveOrUpdate(user);
		roleDAO.saveOrUpdate(role);
		
		
		product.setProductName("fdknmfg");
		productDAO.saveOrUpdate(product);
		
		billingaddress.setAddress("hfdjdufuinv");
		billingaddress.setContactNumber(897465);
		billingaddressDAO.saveOrUpdate(billingaddress);
		
		
		cart.setProductName("dfhjj");
		cartDAO.saveOrUpdate(cart);
		
		
		supplier.setSupplierName("hddsjk");
		supplier.setContactNumber(87968764);
		supplierDAO.saveOrUpdate(supplier);
		
		
		whishlist.setProductName("dhjf");
		whishlist.setPrice(87);
		wishlistDAO.saveOrUpdate(whishlist);
		
		shippingaddress.setAddress("fdgfs");
		shippingaddress.setUserName("jkfgjd");
		shippingaddressDAO.saveOrUpdate(shippingaddress);
		
		
	}

}