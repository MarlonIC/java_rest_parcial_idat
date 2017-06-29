package com.ms.msacademico.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.msacademico.dao.ProductoDAO;
import com.ms.msacademico.repository.Producto;

@Service
public class ProductoBusinness {
	@Autowired
	private ProductoDAO productodao;
	
	public List<Producto> listProducts(){
		return productodao.findAll();
	}
	
	public Producto updateProducts(Producto producto){
		productodao.save(producto);
		return producto;
	}
	
	public List<Producto> listProductsPriceHigher(String precio) {		
		List<Producto> listProduct = new ArrayList<Producto>();
		
		for (Producto producto : productodao.findAll()) {
			if(producto.getPrecio() > Double.parseDouble(precio)){
				listProduct.add(producto);
			}
		}
		
		return listProduct;
	}
	
}
