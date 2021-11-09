import java.util.ArrayList;

public class SelectionSort {
 
	public static void main(String[] args) {
 
 
	}//
 
	public static void insertionSort(int[] elements) {
		int counter = 0;
		for (int j = 1; j < elements.length; j++) {
			int temp = elements[j];
			int pI = j;
			while (pI > 0 && temp < elements[pI - 1]) {
				elements[pI] = elements[pI - 1];
				pI--;
				counter++;
			}
			elements[pI] = temp;
		}
		System.out.println(counter);
	}
	
	public static void insertionSort(ArrayList<Integer> list) {
		int counter = 0;
		for (int i=1; i<list.size(); i++) {
			int temp = list.get(i);
			int pI = i;
			while (pI > 0 && temp < list.get(pI - 1)) {
				list.add(pI, pI - 1);
				pI--;
				counter++;
			}
			list.set(pI, i);
		}
		System.out.println(counter);
	}
 
	public static void selectionSort(int[] elements) {
		int counter = 0;
		for (int j = 0; j < elements.length - 1; j++) {
			int minIndex = j;
			for (int k = j + 1; k < elements.length; k++) {
				if (elements[k] < elements[minIndex]) {
					minIndex = k;
				}
				counter++;
			}
			int temp = elements[j];
			elements[j] = elements[minIndex];
			elements[minIndex] = temp;
		}
		System.out.println(counter);
	}
}