package staticDemo;

public class DatabaseHelper {

	public static class Crud {
					//Create Read Update Delete
		
		public static void Delete() {
			
		}
		
		public static void Update() {
			
		}

	}

	public static class Connection{
		
		public static void createConnection() {
			
		}
	}
}
/*
 * inner class'lar clean code düzenine çok uyum sağlamıyor. 
 * Bibirine benzeyen operasyonları parçalayın ama operasyonlar DatabaseHelper'ın içerisine
 konulduğu zaman SOLID'in single responsibility problemine yol açıyor. 
 * Yani tek sorumluluk prensibine, bir class sadece bir iş yapacak 
 * Burada Crud DatabaseHelper ve Connection DatabaseHelper diye iki arı sınıf oluşturmak gerekiyor.
 */