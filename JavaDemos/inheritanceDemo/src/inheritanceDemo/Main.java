package inheritanceDemo;

public class Main {

	//polymorphism --> çok biçimlilik
	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new TarimKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}
//polymorphism referans tiplerin aralarında inheritance varsa birbirlerinin referansını tutma durumudur. 
