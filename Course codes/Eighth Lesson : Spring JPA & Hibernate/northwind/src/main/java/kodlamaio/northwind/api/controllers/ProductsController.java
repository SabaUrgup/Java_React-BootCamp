package kodlamaio.northwind.api.controllers;
//api katmanı, dış dünya ile entegrasyonu, iletişimi kuracak katman.
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

@RestController //restcontroller anatasyonu, java olmayanlar da beni tanısın olayını sağlar.
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productService; 
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}
//swagger: apileri birçok ortamda hızlıca test edebilmemizi sağlayanbir arayüz ve versiyonlama ortamı.
	/*
	 * @Autowired Spring arka planda projeyi tarıyor kim ProductService ' implements etmiş buluyor 
	 * (ProductManager'ı buluyor ve new'leyip referansını productService'e atıyor)
	 * ve arka planda ProductService productService = new ProductService() yapıyor 
	 * ve newlenmiş productService yerleştiriyor.
	 */

	@GetMapping("/getall")
	public DataResult< List<Product> > getAll(){
		return this.productService.getAll();
		}

	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}
	
	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(@RequestParam String productName){
		return this.productService.getByProductName(productName);
	}
	
	@GetMapping("/getByProductNameAndCategoryId")
	public DataResult<Product> 
	getByProductNameAndCategoryId(@RequestParam("productName") String productName, @RequestParam("categoryId") int categoryId ){
		return this.productService.getByProductNameAndCategoryId(productName, categoryId);
	}
	
	@GetMapping("/getByProductNameContains")
	public DataResult< List<Product> > getByProductNameContains(@RequestParam String productName){
		return this.productService.getByProductNameContains(productName);	
	}
	@GetMapping("/getAllByPage")
	DataResult< List<Product> > getAll(int pageNo, int pageSize){
		return this.productService.getAll(pageNo, pageSize);	
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<Product>> getAllSorted(){
		return this.productService.getAllSorted();
	}
	
}

/*
 * Yapılan istegin parametrelerine bakar, yapılan istek ismindeki parametreyi okur, 
 * atamasını yapar ve gönderir ---> @RequestParam
 */
//API, controller isimlendirme kuralı --> isim çoğul verilir.
//Dış dünyadan sistemimizle iletişim kurduğumuz yere controller denir
