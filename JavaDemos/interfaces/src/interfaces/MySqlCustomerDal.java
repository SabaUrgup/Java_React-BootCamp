package interfaces;

public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void Add() {
		System.out.println("My Sql eklendi");
		
	}

}

/*
 * Dal --> data access layer yani veri tabanı ile ilgili operasyonları yazdığımız yerdir. 
 * Manager --> iş kodlarını yazdığımız yerdir.
 */