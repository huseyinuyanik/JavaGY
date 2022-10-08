package challange2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) {
		
		ornek1();

	}

	private static void ornek1() {
		
		String text="numan";
		
		
		String[] strSplit = text.split("");  
        ArrayList<String> strList = new ArrayList<String>( 
            Arrays.asList(strSplit)); 
        
        
        for (String s : strList) { 
            System.out.println(s); 
    } 
        
        
        LinkedHashMap<String, Integer> kisi= new LinkedHashMap<>();
        
        LinkedHashSet<String> strList2= new LinkedHashSet<>(strList);
        
        System.err.println(strList2);
        
        
        
        for (String a : strList2) {
        	
        	int counter=0;
        	
        	for (String b : strList) {
        		
        		if(a.contains(b)) {
        			
        			counter++;
        		}
        		
        		System.err.println(kisi.put(a, counter));
				
			}
        	
        	System.out.println(kisi);
        	
        	
			
		}
        
        
		
		
		

		
	}

}
