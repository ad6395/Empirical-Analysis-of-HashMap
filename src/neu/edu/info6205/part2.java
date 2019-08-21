package neu.edu.info6205;

import java.util.Scanner;

public class part2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Table:");
		int sz = sc.nextInt();
		HashTable table = new HashTable(sz);
		int c1 = 0;
		System.out.println("\nActual Table Size:" + table.arraySize);
		System.out.println("\nTable Size before insertion of element:" + table.size);
		String D[] = { "United Arab Emirates", "United Kingdom", "Uruguay", "USA", "Uzbekistan", "Vanuatu", "Venezuela",
				"Vietnam", "Virgin Islands", "Wales", "Wallis and Futuna", "West Bank", "Western Sahara", "Yemen",
				"Yugoslavia", "Zambia", "Zimbabwe", "OR - Oregon", "PA - Pennsylvania", "PR - Puerto Rico",
				"RI - Rhode Island", "SC - South Carolina", "SD - South Dakota", "TN - Tennessee", "TX - Texas",
				"UT - Utah", "VA - Virginia", "VI - Virgin Islands", "VT - Vermont", "WA - Washington",
				"WI - Wisconsin", "WV - West Virginia", "WY - Wyoming", "Afghanistan", "Albania", "Algeria", "Andorra",
				"Angola", "Anguilla", "kalra", "patil", "jpshi", "dsd", "err" };

		System.out.println("Element Array Length!" + D.length);

		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t Linear Probing!");
		long T3 = 0;
		for (int i = 0; i < D.length; i++) {
			long T1 = System.nanoTime();
			table.HashFunction1(D[i]);
			long T2 = System.nanoTime();
			T3 = T2 - T1;
		}
		System.out.println("\n Time Required for inserting:" + T3);
		long T5 = System.nanoTime();
		table.find("South Dakota");
		long T6 = System.nanoTime();
		long T7 = T6 - T5;
		System.out.println("\n Time for searching:" + T7);
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t PART 2");

		c1 = D.length;
		double x = (double) c1 / table.arraySize;
		long t1 = 0, t2 = 0;
		for (int i = 0; i < D.length; i++) {
			table.Resize1();
			table.insert(D[i]);

			t1 = System.nanoTime();
			table.find(D[i]);
			t2 = System.nanoTime();

			long T1 = t2 - t1;
			System.out.println("\nTotal Time in Nano Seconds for Finding:" + T1);
			c1++;

		}

		System.out.println(HashTable.total);

		System.out.println("\nTable Size after insertion of element:" + table.size);
		System.out.println("\nNumber of elements with 0 probe:" + HashTable.total);
		System.out.println(c1);
		System.out.println("\nUpdated Array Size:" + table.arraySize);
		table.displayTable();

	}

}
