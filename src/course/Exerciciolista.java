package course;

import java.util.Locale;
import java.util.Scanner;

public class Exerciciolista {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int mat[][] = new int[n][m];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[n][m] = sc.nextInt();
			}
		}
		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[n][m] == x) {
					System.out.println("Position " + i + ", " + j + ": ");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}
}
