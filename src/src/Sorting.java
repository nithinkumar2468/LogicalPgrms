package src;

public class Sorting {
	public static void main(String[] args) {
		int[] a = { 10, 2, 1, 8, 4, 3 };
		Sorting sort = new Sorting();
		sort.Arraysorting(a);
	}

	public void Arraysorting(int[] a) {
		int i = 0, j = 0, temp;

		for (i = 0; i < a.length - 1; i++) {
			for (j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
