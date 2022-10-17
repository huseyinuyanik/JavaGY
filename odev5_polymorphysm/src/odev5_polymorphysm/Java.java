package odev5_polymorphysm;

public class Java implements IIslemler,IDonguler {

	@Override
	public void dortIslem() {
		
		System.out.println("Java ile islem yapildi.");
		
		
	}

	@Override
	public void Dongu() {
		System.out.println("'{' ihtiyac vardir.");
		
	}

}
