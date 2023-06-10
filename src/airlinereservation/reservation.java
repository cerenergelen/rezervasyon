package airlinereservation;

import java.util.Scanner;


public class reservation {
	private static char first;
	private static char ekonomi;
	private static char business;
	static char[][] seats = { { first  }, { ekonomi  }, { business },
			 };

	public static boolean isFull() {
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				if (seats[i][j] != 'X') {
					return false;
				}
			}
		}
		return true;
	}

	public static void printSeats() {
		int row = 1;
		for (int i = 0; i < seats.length; i++) {
			System.out.print(row++ + " ");
			for (int k = 0; k < seats[i].length; k++) {
				System.out.printf(seats[i][k] + " ");
			}
			System.out.println();
		}
	}

	
	public static int getIndex(char character) {
		switch (character) {
		case 'A':
			return 0;
		case 'B':
			return 1;
		case 'C':
			return 2;
		default:
			return 3;
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while (!isFull()) {
			printSeats();
			System.out.println("koltuk ayırtmak icin herhangi bi tusa basin veya cıkmak icin x basin");
			char check = Character.toUpperCase(scan.nextLine().charAt(0));
			if (check == 'X') {
				System.out.println("Görüsürüz!!!");
				System.exit(0);
			}

			
			System.out.println("Lütfen koltuk sira numarasini giriniz...");
			int row = 0;
			boolean rowTaken = false;
			while (!rowTaken) {
				int checkRow = Character.getNumericValue(scan.nextLine().charAt(0));
				if (checkRow >= 1 && checkRow <= 7) {
					row = checkRow;
					rowTaken = true;
				} else {
					System.out.println("Yanlıs secim, lütfen 1 ile 7 arasında bir sayı girin !!");
				}
			}

			
			System.out.println("Lütfen ayırtmak istediğiniz koltuğu temsil eden bir karakter girin. ");
			char column = ' ';
			boolean columnTaken = false;
			while (!columnTaken) {
				char checkColumn = Character.toUpperCase(scan.nextLine().charAt(0));
				if (checkColumn >= 'A' && checkColumn <= 'D') {
					column = checkColumn;
					columnTaken = true;
				} else {
					System.out.println("Yanlıs giris lütfen A ile D arasında bir koltuk girin !!");
				}
			}

			
		
      
			
		        	if (seats[row - 1][getIndex(column)] == 'X') {
			
				System.out.println("Üzgünüm, yer zaten dolu, baska bir yer almayı deneyin.");
			} else {
				seats[row - 1][getIndex(column)] = 'X';
				System.out.println("koltuğun " + row + column + " basarıyla rezerve edildi.");
			}
		}
		System.out.println("ucak dolu.");
		System.exit(0);

	}
}




   