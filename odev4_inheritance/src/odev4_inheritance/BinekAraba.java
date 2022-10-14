package odev4_inheritance;

public class BinekAraba extends Arac {

	private boolean otomatik;
	private boolean kasko;

	@Override
	public void ehliyet() {

		System.out.println(" B sınıfı Arac ehliyetine ihtiyac vardir." );

	}

	public void fiyatartis(int fiyat) {
		if(otomatik) {
			
			fiyat=fiyat+1000;
			
		}
		System.out.println(fiyat);
		
	}

	
	
	
	
	
	public boolean isOtomatik() {
		return otomatik;
	}

	public void setOtomatik(boolean otomatik) {
		this.otomatik = otomatik;
	}

	public boolean isKasko() {
		return kasko;
	}

	public void setKasko(boolean kasko) {
		this.kasko = kasko;
	}

}
