package ders4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

//collection: aynı elemandan birden fazla tutmak anlamına gelir.

public class Main {

	public static void main(String[] args) {
		
//		int[] sayilar= new int[4];
//		int[] sayilar2= new int[] {1,2,3};
		
		ornek1();
		ornek2();
		ornek3();
		ornek4();
		ornek5();
		ornek6();
		ornek7();
		ornek8();
		
		
		
		
		
	}
	
	private static void ornek8() {
		Set<Person> liste= new HashSet<>();
		
		liste.add(new Person("kaan",25));
		liste.add(new Person("kaan",25));
		liste.add(new Person("kaan",25));
		liste.add(new Person("kaan",25));
		System.out.println(liste.toString());
		
	}

	// set=>>> aynı elemandan birden fazla eklenemez.
	
	private static void ornek7() {
		Set<Integer> sayilar= new HashSet<>();
		sayilar.add(1);
		sayilar.add(3);
		sayilar.add(4);
		sayilar.add(4);
		System.out.println(sayilar.toString());
		
		
	}

	private static void ornek6() {
		//Bu bir matristir diyebiliriz.
		
		ArrayList<ArrayList<Person>> kisilerListesi;
		
		
	}
	
	private static void ornek5() {
		
		PriorityQueue<Person> sira= new PriorityQueue<>();
		ArrayDeque<Person> sira2= new ArrayDeque<>();
		sira.peek();
		sira2.peek();
		
	}
	
	
	private static void ornek4() {
		
		Stack<Person> stack= new Stack<>();
		stack.push(new Person("asd",23));
		System.out.println(stack.pop());
	}
	
	private static void ornek3() {
		
		//linkedlistte arraylistten farklı olarak sıralama kesindir.
		
		LinkedList<Person> kisiler= new LinkedList<>();
		Person p= new Person("berrin",20);
		Person p2= new Person("beste",21);
		kisiler.add(p);
		kisiler.add(p2);
		System.out.println(kisiler);
		kisiler.get(1);
	}
	
	
	
	private static void ornek1() {
			
			ArrayList<Integer> liste= new ArrayList<>();
			liste.add(1);
			liste.add(2);
			liste.add(3);
			
			liste.remove(1);
			boolean a=liste.contains(2);
			
			System.out.println(liste);
			System.out.println(a);
			System.out.println(liste.toString());
			
			
			
		}
	
	private static void ornek2() {
		
		ArrayList<Person> liste= new ArrayList<>();
		Person p= new Person("berrin",20);
		Person p2= new Person("beste",21);
		liste.add(p);
		liste.add(p2);
		
		for (Person person : liste) {
			System.out.println(person.isim + " - " + person.yas);
			
			
			
		}
		
		System.out.println(liste.get(1).isim);
		
		Iterator<Person> itr = liste.iterator();
		
		while (itr.hasNext()) {
			Person person =  itr.next();
			System.out.println(person.isim + " - " + person.yas);
			
		}
	}

}

class Person{
	public String isim;
	public int yas;
	
	public Person(String isim, int yas) {
		this.isim=isim;
		this.yas=yas;
		
	}
	
}
