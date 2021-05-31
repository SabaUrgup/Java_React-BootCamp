package kodlamaio.northwind.dataAccess.abstracts;
//data layer-date access-persistence katmanı :Veri erişim işlerinin yapıldığı katman 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product, Integer>{
//veri tabanı intereger olduğu için ona göre yapılandırdık.
	
	Product getByProductName(String productName);
	
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId );
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId ) ;
	
	List<Product> getByCategory_CategoryIdIn( List<Integer> categories) ;
	
	List<Product> getByProductNameContains( String productName) ;
	
	List<Product> getByProductNameStartsWith( String productName) ;
	
	@Query("From Product where productName =: productName and category.categoryId =: categoryId")
	List<Product> getByNameAndCategory(String productName, int categoryId ) ;
	
	  @Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto"
		  		+ "(p.id, p.productName, c.categoryName) "
		  		+ "From Category c Inner Join c.products p")
		  List<ProductWithCategoryDto> getProductWithCategoryDetails();
	
	
}
