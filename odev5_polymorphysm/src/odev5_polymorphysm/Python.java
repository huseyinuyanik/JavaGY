package odev5_polymorphysm;

public class Python implements IIslemler, IDonguler{

	@Override
	public void dortIslem() {
		System.out.println("Python ile islem yapildi.");
		
	}

	@Override
	public void Dongu() {
		System.out.println("'{' ihtiyac yoktur.");
		
	}

}
