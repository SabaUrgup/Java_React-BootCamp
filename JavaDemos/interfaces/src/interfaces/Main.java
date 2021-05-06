package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
	}

}
/*
 * classlarda tüm operasyonların(metotların) tanımlanmış olduğu bir yapı vardır.
 
 *class'lar birden fazla interface'leri implement edebilir ama sadece bir tane class'ı ya da sadece bir tane abstract'ı extend edebilir. 
 
 * abstract classlarda kimisi boş kimisi dolu metotların olduğu bir yapı vardır
 ve abstract class'ı inherit eden içini doldurmak zorundadır.
 
 * inheritance'da bir class sadece bir class'ı inherit edebiliyor.
 
 * intfaces operasyonlarımızın içerisinde tamamlanmamış operasyonlar içerir
 abstractlarla benzer bir yapıya sahiptirler.
 
 *interfaces aynı abstractlar gibi new'lenemezler.
 
 * interface'ler class değildir sadece referans tutucu görevi görürüler.
 
 *interface'ler imza taşırlar. 
 
 *interfaces'da inheritance kabul etmiyor implementasyon kabul ediliyor 
 ve bir class birden fazla inteface'i implement ediyor yani uygulayabiliyor. 
 
 *interface onu implement eden class'ın referansını tutabilir --> polymorphisim
 
 *Yazılım projelerindeki katmanların geçişleri bağımlılıkları önlemek için genellikle interface'ler yardımı ile yapılır
 */