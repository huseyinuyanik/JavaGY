package odev3;

public class Main {
	
	public static void main(String[] args) {
		
		String kelime = "aacaaaabaaa";
        int counter=0;
        for (int i=0;i<=kelime.length()-1;i++){
            if (i==kelime.length()-1){
                System.out.print(counter+1+" ");
                System.out.println(kelime.charAt(i));
            }else if(kelime.charAt(i) == kelime.charAt(i+1)){
                    counter++;
            }
            else{
                System.out.print(counter+1+" ");
                System.out.println(kelime.charAt(i));
                counter=0;
            }
        }
		
	

	
		
		
		

	}
	
}


