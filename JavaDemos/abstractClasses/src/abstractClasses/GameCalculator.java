package abstractClasses;

public abstract class GameCalculator {
	 public abstract void hesapla();
	 
	 public final void gameOver() {
		 System.out.println("Oyun bitti");
	 }
}
//abstract class'i miras alan siniflar abstract metodu override etmekle zorundadirlar.
//final metotları kullanan sınıflar metotları degistiremezler.
//abstract bir classta abstract bir metot olmak zorunda degildir. 