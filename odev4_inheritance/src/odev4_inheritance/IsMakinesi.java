package odev4_inheritance;

public class IsMakinesi extends Arac {
	
	private int yukkapasitesi;
	
	
	@Override
	public void ehliyet() {
		
		System.out.println(" E Sınıfı Arac ehliyetine ihtiyac vardir." );
		
	}
	
	
	public void yuk() {
		
		if(yukkapasitesi<30000) {
			System.out.println("Yola cikabilir.");
		}
		
		else {
			System.out.println("Yola cikamaz");
		}
	}
	
	
	
	
	
	
	public int getYukkapasitesi() {
		return yukkapasitesi;
	}

	public void setYukkapasitesi(int yukkapasitesi) {
		this.yukkapasitesi = yukkapasitesi;
	}

	

}
