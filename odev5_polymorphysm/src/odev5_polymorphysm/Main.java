package odev5_polymorphysm;

public class Main {

	public static void main(String[] args) {
		
		ProgramManager python= new ProgramManager(new Python(), new Python());
		python.islem();
		python.dongu();
		
		
		ProgramManager java= new ProgramManager(new Java(), new Java());
		java.dongu();
		java.islem();
		
		
		

	}

}
