package sayilari_buyukten_kucuge_siralama;

import java.util.Scanner;

public class sayilari_buyukten_kucuge_siralama {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("1. sayıyı girin: ");
		int num1 = scan.nextInt();

		System.out.print("2. sayıyı girin: ");
		int num2 = scan.nextInt();

		System.out.print("3. sayıyı girin: ");
		int num3 = scan.nextInt();

		if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.println(num1 + ">" + num2 + ">" + num3);
			} else {
				System.out.println(num1 + ">" + num3 + ">" + num2);
			}

		} else {
			if (num2 > num3) {
				System.out.println(num2 + ">" + num3 + ">" + num1);
			} else {
				System.out.println(num3 + ">" + num2 + ">" + num1);
			}
		}

		if (num3 > num1 && num3 > num2) {
			if (num1 > num2) {
				System.out.println(num3 + ">" + num1 + ">" + num2);
			}
		}

		if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.println(num2 + ">" + num1 + ">" + num3);
			}
		}
	}

}
