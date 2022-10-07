package odev1;

import java.util.Scanner;

public class Converter {

	public static void conv() {

		System.out.println("Metin giriniz: ");
		Scanner s = new Scanner(System.in);
		String text = s.next();

		System.out.println("Metin: " + text);

		char[] text2 = new char[text.length()];

		for (int i = 0; i < text.length(); i++) {
			text2[i] = text.charAt(i);
		}

		for (char x : text2) {
			System.out.println(x);
		}

		for (int c = 0; c < text2.length; c++) {

			if (text2[c] == 'A') {

				text2[c] = '1';

			}

			else if (text2[c] == 'E') {

				text2[c] = '2';
			}

			else if (text2[c] == 'I') {

				text2[c] = '3';
			}

			else if (text2[c] == 'i') {

				text2[c] = '4';
			} else if (text2[c] == 'O') {

				text2[c] = '5';
			}

			else if (text2[c] == 'u') {

				text2[c] = '7';
			}

		}

		StringBuilder text3 = new StringBuilder();
		for (int i = 0; i < text2.length; i++) {
			text3.append(text2[i]);
		}
		String joinedString = text3.toString();
		System.out.println("Donusturulmus hali:" + joinedString);

	}

}
