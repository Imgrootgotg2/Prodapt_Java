package collectionsAndGenerics;

public class Swap {
	public static <T> T[] swap(T[] list, int firstPos, int secondPos) {
		if (firstPos < 0 || firstPos >= list.length || secondPos < 0 || secondPos >= list.length) {
			throw new IndexOutOfBoundsException("Either one or both the given indexes are out of bounds.");
		}

		T temp = list[firstPos];
		list[firstPos] = list[secondPos];
		list[secondPos] = temp;
		return list;
	}

	public static void main(String[] args) {
		String[] strList = { "I", "want", "some", "tea", "!!" };
		Integer[] intList = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Arrays before Swap: ");
		for (Integer i : intList) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (String s : strList) {
			System.out.print(s + " ");
		}
		swap(strList, 1, 3);
		swap(intList, 1, 3);
		// swap(list,1,8); exception
		System.out.println("\n");
		System.out.println("Arrays after Swap: ");
		for (Integer i : intList) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (String s : strList) {
			System.out.print(s + " ");
		}
	}
}