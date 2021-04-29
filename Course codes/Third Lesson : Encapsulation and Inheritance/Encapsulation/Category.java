package oopIntro;

public class Category {
	private int id;
	private String name;
	
	
	public Category() {
		
	}
	
	
	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}
	
	
	//void: geriye bir �ey d�nd�rmeyen de�erler
	public void setId( int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name + "!";
	}
	
	public void setName(String name) {
		this.name = name;		
	}
}
