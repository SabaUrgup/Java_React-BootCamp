package kodlamaio.northwind.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categories")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"})
	//Hibernate sadece map edilen kadarını getiremesini sağlayan--> yükleme mimarisi (hibernateLazyInitializer)
public class Category {
	
	@Id
	@Column(name = "category_id")
	private int categoryId;
	
	@Column(name = "category_name")
	private String categoryName;
	
	@OneToMany(mappedBy = "category")
	private List<Product> products;
	
}
/* (datanın tekrar etmemesi icin) en cok kullanilan iliski turleri;
 * one to many --> ana tabloda bir kere geçer diğer tabloda da çok kere geçebilir 
 * one to one --> ana tabloda bir kere geçer diğer tabloda da bir kere geçebilir
 */