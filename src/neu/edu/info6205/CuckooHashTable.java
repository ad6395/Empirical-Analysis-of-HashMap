package neu.edu.info6205;

import java.util.Arrays;

public class CuckooHashTable {
	String[] hashArray;
	int arraySize;
	int size = 0;
	static int total = 0;
	int i;
	int count1 = 0;
	int count2 = 0;
	int hashVal1, hashVal2;
	String D[] = { "5007", "5008", "5009", "5010", "6000", "6001", "6002", "6003", "6004", "6005", "6006", "6007",
			"6008", "6009", "6010", "4006", "4007", "4008", "4009", "4010", "5000", "5001", "5002", "5003", "5004",
			"5005", "5006", "5007", "5008", "6009", "6010", "4006", "6009", "6010", "4006", "6009", "6010", "4006", "1",
			"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
			"21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38",
			"39", "40", "41", "42" };
	// String C[] = new String[D.length];
	// String E[] = new String[D.length];

	public void find(String word, String[] C, String[] E) {
		hashVal1 = Integer.valueOf(word) % D.length;
		int arraySize = D.length;
		System.out.println("hashVal 1 is" + hashVal1);
		int c = Integer.valueOf(word);
		int d = Integer.valueOf(hashVal1);
		// System.out.println(C.length + "c ka leng" + C[hashVal1]);
		if (d == c) {
			// System.out.println("Element found at:" + hashVal1);
		}

		else {
			System.out.println("in else");
			hashVal2 = (Integer.valueOf(word) / arraySize) % arraySize;
			while (E[hashVal2] != null) {
				if (E[hashVal2].equals(word)) {
					System.out.println("Element found at:" + hashVal2);
					break;
				} else {
					hashVal2 = (hashVal2 / arraySize) % arraySize;
					hashVal2 = hashVal2 + 1;
				}

			}
		}
	}

	public static void main(String[] args) {
		int i;
		int count1 = 0;
		int count2 = 0;
		int hashVal1 = 0;
		int hashVal2 = 0;
		CuckooHashTable ct = new CuckooHashTable();

		// String C[] = new String[44];
		// String E[] = new String[44];
		String D[] = { "5007", "5008", "5009", "5010", "6000", "6001", "6002", "6003", "6004", "6005", "6006", "6007",
				"6008", "6009", "6010", "4006", "4007", "4008", "4009", "4010", "5000", "5001", "5002", "5003", "5004",
				"5005", "5006", "5007", "5008", "6009", "6010", "4006", "6009", "6010", "4006", "6009", "6010", "4006",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
				"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36",
				"37", "38", "39", "40", "41", "42" };
		String C[] = new String[D.length];
		String E[] = new String[D.length];
		// HashTable table = new HashTable(44);

		for (i = 0; i < D.length; i++) {
			System.out.println(D.length);
			// table.insert1(D[i]);
			int x = C.length * 2;
			int arraySize = D.length;
			if ((float) count1 / D.length > 0.75) {
				System.out.println((float) count1 / D.length + "is the load factor");
				int NewArraySize = x;

				// String[] oldArray = new String[arraySize];
				// oldArray = Arrays.copyOf(hashArray, hashArray.length);
				// System.out.println(Arrays.toString(oldArray));
				String[] newArray = new String[NewArraySize];

				newArray = Arrays.copyOf(C, NewArraySize);

				arraySize = NewArraySize;
				C = newArray;

			}
			hashVal1 = Integer.valueOf(D[i]);

			hashVal1 = hashVal1 % arraySize;
			System.out.println(hashVal1 + "hashVal1 value");
			if (hashVal1 < 0) {
				hashVal1 += arraySize;
			}
			if (C[hashVal1] == null) {

				C[hashVal1] = D[i];
				count1++;

			} else {
				int x1 = 2 * E.length;
				int arraySize2 = D.length;
				if ((float) count2 / D.length > 0.75) {
					int NewArraySize = x1;
					// String[] oldArray = new String[arraySize];
					// oldArray = Arrays.copyOf(hashArray, hashArray.length);
					// System.out.println(Arrays.toString(oldArray));
					String[] newArray = new String[NewArraySize];
					newArray = Arrays.copyOf(E, NewArraySize);

					arraySize = NewArraySize;
					E = newArray;

				}
				hashVal2 = Integer.valueOf(D[i]);
				hashVal2 = (hashVal2 / arraySize) % arraySize;
				if (hashVal2 < 0) {
					hashVal2 += arraySize;
				}
				if (E[hashVal2] == null) {
					E[hashVal2] = D[i];
				} else {
					while (E[hashVal2] != null) {
						if (E[hashVal2].equals(D[i])) {
							// System.out.println("Element found at:" + hashVal);
						}
						hashVal2 = hashVal2 + 1;
						if (hashVal2 == E.length) {
							hashVal2 = 0;
						}
						// hashVal2 = hashVal2 % arraySize;
					}
					E[hashVal2] = D[i];

				}

				count2++;

			}

		}

		for (int i1 = 0; i1 < C.length; i1++) {
			System.out.println("\nVALUE OF ELEMENT IN C    " + C[i1] + "at hashvalue" + i1);
		}
		for (int i1 = 0; i1 < E.length; i1++) {
			System.out.println("\nVALUE OF ELEMENT IN E    " + E[i1] + "at hashvalue" + i1);

		}

		long u1 = System.nanoTime();
		ct.find("5007", C, E);
		long u2 = System.nanoTime();
		long U1 = u2 - u1;
		System.out.println("\nTotal Time for finding in Nano Seconds:" + U1);

		// table.displayTable();

	}

	/*
	 * public int cuckoohash(String word) { int hashVal = word.hashCode(); hashVal =
	 * hashVal % arraySize; if (hashVal < 0) { hashVal += arraySize; } while
	 * (hashArray[hashVal] != null) {
	 * 
	 * }
	 * 
	 * return hashVal; }
	 */
}
