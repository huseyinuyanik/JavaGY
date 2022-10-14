package odev4_inheritance;

public class Motorsiklet extends Arac {
	
	private boolean kask;
	
	
	public boolean isKask() {
		return kask;
	}


	public void setKask(boolean kask) {
		this.kask = kask;
	}


	@Override
	public void ehliyet() {
		
		System.out.println(" C sınıfı Arac ehliyetine ihtiyac vardir." );
		
	}
	
	public void kaskVarmi() {
		if(kask) {
			System.out.println("surebilir.");
		}
		else {
			System.err.println("Suremez");
		}
	}

}
