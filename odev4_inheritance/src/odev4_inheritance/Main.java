package odev4_inheritance;

public class Main {

	public static void main(String[] args) {
		
		BinekAraba binekaraba= new BinekAraba();
		
		Motorsiklet motorsiklet=new Motorsiklet();
		
		IsMakinesi ismakinesi= new IsMakinesi();
		
		binekaraba.setKasko(false);
		binekaraba.setOtomatik(true);
		binekaraba.setFiyat(20000);
		binekaraba.setOtomatik(true);
		binekaraba.setEhliyettipi('B');
		binekaraba.setAracAnaharKey(23324);
		binekaraba.setMarka("Audi");
		
		
		binekaraba.fiyatartis(100);
		binekaraba.ehliyet();
		System.out.println(binekaraba.getMarka());
		
		
		
		motorsiklet.setKask(false);
		motorsiklet.kaskVarmi();
		
		motorsiklet.setEhliyettipi('C');
		motorsiklet.ehliyet();
		
		
		ismakinesi.setYukkapasitesi(5000);
		ismakinesi.yuk();

	}

}
