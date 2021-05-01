package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	
	public double hesapla(double tutar) {
		return tutar * 1.10;

	}
}

/*
 *hesapla'yı aynı BaseKrediManager'daki aynı imza ile yazdığımız için OgrenciKrediManager'daki çalışır.
 *Bu yapılan işleme overriding denir.
 */

//Java' da bir sınıfın herhangi bir operasyonu aksi belirtilmedikçe (overridable) üzerine yazılabilir. 
//Üzerine yazılmasını istemiyorsak operasyonu final olarak tanımlamak gerekir.