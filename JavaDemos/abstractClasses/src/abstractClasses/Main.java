package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		GameCalculator gameCalculator = new GameCalculator() {
			
			@Override
			public void hesapla() {
				// TODO Auto-generated method stub
				
			}
		};
		// abstract sınıflar operasyonları override edilmeden new'lenemezler
		
		GameCalculator gameCalculator2 = new WomanGameCalculator();
		//abstract classlar referans tutabilirler.
	}

}
