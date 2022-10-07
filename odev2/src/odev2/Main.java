package odev2;

public class Main {

	public static void main(String[] args) {

		int[] text = { 1, 2, 3, 4 };

		for (int i = 0; i < text.length; i++) {

			if (text[i] == 1) {

				text[i] = 9;

			}

			else if (text[i] == 2) {

				text[i] = 8;

			} else if (text[i] == 3) {

				text[i] = 7;

			} else if (text[i] == 4) {

				text[i] = 6;

			} else if (text[i] == 5) {

				text[i] = 5;

			} else if (text[i] == 6) {

				text[i] = 4;

			} else if (text[i] == 7) {

				text[i] = 9;

			} else if (text[i] == 8) {

				text[i] = 2;

			} else if (text[i] == 9) {

				text[i] =7;

			}
			
			System.err.println(text[i]);

		}

	}

}
