package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productService; 
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	/*
	 * @Autowired Spring arka planda projeyi tarıyor kim ProductService ' implements etmiş buluyor 
	 * ve arka planda ProductService productService = new ProductService() yapıyor 
	 * ve newlenmiş productService yerleştiriyor
	 */
	
	@GetMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
		}
	/*
*ProductsController vasıtasıyla bu public List<Product> getAll(){	} metot desteği veriyoruz demektir
	 */
	
}


//API, controller isimlendirme kuralı --> isim çoğul verilir.
//Dış dünyadan sistemimizle iletişim kurduğumuz yere controller denir
