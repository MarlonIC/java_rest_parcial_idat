package com.ms.msacademico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ms.msacademico.business.ProductoBusinness;
import com.ms.msacademico.repository.Producto;

@RestController
@RequestMapping(value="/producto")
public class ProductoController {
	@Autowired
	private ProductoBusinness productoBusiness;

	@RequestMapping(value="/listProducts", method=RequestMethod.GET)
	public List<Producto> listProducts() {
		return productoBusiness.listProducts();
	}
	
	@RequestMapping(value="/saveProducts", method=RequestMethod.POST)
	public Producto updateProducts(@RequestBody Producto producto) {		
		return productoBusiness.updateProducts(producto);
	}
	
	@RequestMapping(value="/pricehigher/{precio}", method=RequestMethod.GET)
	public List<Producto> listadoProductosPreciosMayores(@PathVariable String precio) {
		return productoBusiness.listProductsPriceHigher(precio);
		//return productoBusiness.listProducts();
	}
}
