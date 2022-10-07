package ders2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		array();
		matrisOrnek();
	}

	public static void array() {
			
			int[] sayilar= new int[] {2,3,4,5,6,7};
			sayilar[0]=1;
			System.out.println(sayilar[0]);
			
			for (int i = 0; i < sayilar.length; i++) {
				
				System.out.println(sayilar[i]);
			
		}
		

	}
	
	
	public static void matrisOrnek() {
		
		int[] sayilar= new int[] {1,2,3};
		int[]sayilar2= {4,5,6};
			
		int[][] matris=new int [][] {sayilar,sayilar2};
		
		for (int i = 0; i < matris.length; i++) {
			
			System.out.println(matris[i]);
			
		}
			
		}

}
