package se.rosa.sortingArray.repository;

/**
 * Created by Robert on 2019-04-24.
 */
public class NumberRepository {
	private int[] numbers;

	public NumberRepository(int amount) {
		numbers = new int[amount];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 101);
		}

	}

	public void sortArray() {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i + 1 < numbers.length) {
					if (numbers[i] > numbers[i + 1]) {
						int higher = numbers[i];
						int lower = numbers[i + 1];
						numbers[i] = lower;
						numbers[i + 1] = higher;
						i = 0;
					}
				}
			}
		}
	}

	public int[] mergeArray(int[] toMerge) {
		int[] newList = new int[numbers.length + toMerge.length];
		for (int i = 0, j = numbers.length; i < newList.length; i++, j++) {

			if (i < numbers.length) {
				newList[i] = numbers[i];
			}
			if (j < newList.length) {
				newList[j] = toMerge[i];
			}
		}
		return numbers = newList;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void printNumbers() {
		System.out.println("numbers: ");
		for (int number : numbers) {
			System.out.print(number + ", ");

		}
		System.out.println();
	}
}
