package kacHarfChallange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		//calculate();
		calculate2();

	}

	public static void calculate() {

		System.out.println("Metin giriniz: ");
		Scanner s = new Scanner(System.in);
		String girilen = s.next();

		System.out.println("Metin: " + girilen);

		String[] girilenn = girilen.split("");

		ArrayList<String> girilen2 = new ArrayList<String>(Arrays.asList(girilenn));

		LinkedHashSet<String> text = new LinkedHashSet<String>();

		for (String g : girilen2) {
			text.add(g);

		}

		System.out.println(text);

	}

	public static void calculate2() {

		String str = "Numan karaaslan";
		str = str.toLowerCase();

		String[] strSplit = str.split("");

		ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strSplit));

		System.out.println(strList);

		strList.remove(" ");
		System.out.println(strList);

		LinkedHashSet<String> strList2 = new LinkedHashSet<>();

		for (String strr : strList) {
			strList2.add(strr);

		}
		System.out.println(strList2.toString());

		ArrayList sonuc = new ArrayList();

		for (String s2 : strList2) {

			int counter = 0;

			for (String s1 : strList) {

				if (s2.contains(s1)) {

					counter = counter + 1;

				}

			}
			System.out.println(s2 + counter);
			sonuc.add(s2);
			sonuc.add(counter);

		}

		System.out.println(sonuc);

	}

}
