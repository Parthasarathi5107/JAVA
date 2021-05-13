package com.capg.msc.myshoppingcart.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.msc.myshoppingcart.bean.Product;
import com.capg.msc.myshoppingcart.dao.ProductRepository;
import com.capg.msc.myshoppingcart.exception.InvalidCostRangeException;


@Service
public class ProductServiceImpl implements ProductService
{
	@Autowired
	private ProductRepository repo;

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
		
	}

	@Override
	@Transactional
	public Product saveProduct(Product p) {
		// TODO Auto-generated method stub
		repo.save(p);
		return p;
	}
	
	@Override
	public String deleteProduct(int id) {
		repo.deleteById(id);
		return "Deleted";
	}

	@Override
	public Product updateProduct(Product p, int id) {
		Optional<Product> toUpdate=repo.findById(id);
		if(toUpdate.isPresent())
		{
			Product product=toUpdate.get();
			product.setProductName(p.getProductName());
			product.setProductCost(p.getProductCost());
			product.setProductRating(p.getProductRating());
			product.setCategory(p.getCategory());
			return repo.save(product);
		}
		return null;
	}
	
	
	@Override
	public List<Product> getAllProductsByCategory(String category) {
		
		return repo.getProductByCategory(category);
	}

	@Override
	public List<Product> getAllProductsByCategoryAndPrice(String category, int range1, int range2) {
		
		return repo.getProductByCategoryAndPrice(category, range1, range2);
	}

	@Override
	public List<Product> getAllProductsByCategoryAndRating(String Category,int rating) {
		// TODO Auto-generated method stub
		return repo.getProductByCategoryAndRating(Category, rating);
	}

	@Override
	public Product getProductById(int id)  {
		return repo.findById(id).get();
		
	}
	
}
