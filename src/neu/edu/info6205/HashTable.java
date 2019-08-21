package neu.edu.info6205;

import java.util.Arrays;

public class HashTable {
	String[] hashArray;
	int arraySize;
	int size = 0;
	static int total = 0;

	public HashTable(int noOfSlots) {

		if (isPrime(noOfSlots)) {
			hashArray = new String[noOfSlots];
			arraySize = noOfSlots;
			size = noOfSlots;
		} else {
			int primeCount = getNextPrime(noOfSlots);
			hashArray = new String[primeCount];
			arraySize = primeCount;
			System.out.println("\nSize of HashTable: " + noOfSlots + " is not prime!");
			System.out.println("\nSize of HashTable Changed to:" + primeCount);

		}

	}

	private boolean isPrime(int num1) {
		for (int i = 2; i * i <= num1; i++) {
			if (num1 % i == 0) {
				return false;
			}
		}
		return true;
	}

	private int getNextPrime(int num2) {
		for (int i = num2; true; i++) {
			if (isPrime(i)) {
				return i;
			}
		}
	}

	public int HashFunction1(String word) {
		int hashVal = word.hashCode();
		hashVal = hashVal % arraySize;
		if (hashVal < 0) {
			hashVal += arraySize;
		}
		return hashVal;
	}

	public int HashFunction2(String word) {
		int hashVal = word.hashCode();
		hashVal = hashVal % arraySize;
		if (hashVal < 0) {
			hashVal += arraySize;
		}
		return 3 - hashVal % 3;

	}

	public void insert(String word) {
		int count = 0;
		// System.out.println("\nOriginal Array:" + Arrays.toString(hashArray));
		int hashVal = HashFunction1(word);
		int stepSize = HashFunction2(word);
		// System.out.println(hashVal);
		// System.out.println(stepSize);
		System.out.println("\nWord inserted: " + word + " OldINDEX: " + hashVal);
		System.out.println("Step Size:" + stepSize);

		while (hashArray[hashVal] != null) {
			hashVal = hashVal + stepSize;
			hashVal = hashVal % arraySize;
			count++;

		}
		if (count == 0) {
			total++;
		}

		System.out.println("\nProbe length:" + count);
		System.out.println("Word inserted: " + word + " INDEX: " + hashVal);

		hashArray[hashVal] = word;

		size++;
		// System.out.println("\nUpdated Array:" + Arrays.toString(hashArray));
	}

	public void find(String word) {
		int hashVal = HashFunction1(word);
		int stepSize = HashFunction2(word);

		while (hashArray[hashVal] != null) {
			if (hashArray[hashVal].equals(word)) {
				System.out.println("Element found at:" + hashVal);
			}
			hashVal = hashVal + stepSize;
			hashVal = hashVal % arraySize;
		}

	}

	public void displayTable() {
		System.out.println("\nUpdated Table Size:" + hashArray.length);
		System.out.println("\nElement Number in Table Size after insertion of element:" + arraySize);
		for (int i = 0; i < arraySize; i++) {
			if (hashArray[i] != null) {
				System.out.print(hashArray[i] + " ");
			} else {
				System.out.print("** ");
			}
			System.out.println("");
		}
	}

	public void Resize() {

		int NewArraySize = 2 * arraySize;
		String[] oldArray = new String[arraySize];
		oldArray = Arrays.copyOf(hashArray, hashArray.length);
		System.out.println(Arrays.toString(oldArray));
		hashArray = new String[NewArraySize];
		hashArray = Arrays.copyOf(oldArray, NewArraySize);

		arraySize = NewArraySize;
		System.out.println("\nUpdated Array:" + Arrays.toString(hashArray));
		System.out.println("\nUpdated Table Size:" + hashArray.length);
	}

	public void Resize1() {

		int NewArraySize = arraySize + 1;
		String[] oldArray = new String[arraySize];
		oldArray = Arrays.copyOf(hashArray, hashArray.length);
		System.out.println(Arrays.toString(oldArray));
		hashArray = new String[NewArraySize];
		hashArray = Arrays.copyOf(oldArray, NewArraySize);

		arraySize = NewArraySize;
		System.out.println("\nUpdated Array:" + Arrays.toString(hashArray));
		System.out.println("\nUpdated Table Size:" + hashArray.length);
	}

	public void insert1(String word) {
		int hashVal = HashFunction1(word);

		hashArray[hashVal] = word;
		System.out.println("Word inserted: " + word + " INDEX: " + hashVal);
		size++;
	}

}
