import java.util.ArrayList;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
		
	}
	public static void bubbleSort(ArrayList<Integer> list) {
		
	}
	
	public static int[] randomize(int[] arr) {
		
		return arr;
	}
	public static ArrayList<Integer> randomize(ArrayList<Integer> list) {
		return list;
	}
	
	public static String format(int[] arr) {
		String str = "[";
		for(int i=0; i<arr.length-1; i++)
			str += arr[i] + ", ";
		str += arr[arr.length-1] + "]";
		return str;
	}
	public static String format(ArrayList<Integer> list) {
		String str = "{ ";
		for(int i=0; i<list.size()-1; i++)
			str += list.get(i) + ", ";
		str += list.get(list.size()-1) + "}";
		return str;
	}
	
}
