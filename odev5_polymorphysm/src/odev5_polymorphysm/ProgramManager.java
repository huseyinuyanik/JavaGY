package odev5_polymorphysm;

public class ProgramManager {
	
	
	private IIslemler iislemler;
	private IDonguler ıdonguler;
	
	public ProgramManager(IIslemler iislemler, IDonguler ıdonguler) {
		this.iislemler=iislemler;
		this.ıdonguler=ıdonguler;
		
				
	}
	
	
	
	
	
	public void dongu() {
		
		ıdonguler.Dongu();
	}
	
	
	
	
	public void islem() {
		
		iislemler.dortIslem();
	}
	
	
	

}
