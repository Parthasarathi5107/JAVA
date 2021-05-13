package com.capg.msc.myshoppingcart.service;

import java.util.List;

import com.capg.msc.myshoppingcart.bean.Product;
import com.capg.msc.myshoppingcart.exception.InvalidCostRangeException;

public interface ProductService {

	public List<Product> getAllProducts();
	
	public Product saveProduct(Product p);
	
	public String deleteProduct(int p);
	
	public Product updateProduct(Product p,int id);
	
    public List<Product> getAllProductsByCategory(String category);
	
	public List<Product> getAllProductsByCategoryAndPrice(String category,int range1,int range2);
	

	public List<Product> getAllProductsByCategoryAndRating(String Category, int rating);

	public Product getProductById(int id);
	
	
	
	
}
