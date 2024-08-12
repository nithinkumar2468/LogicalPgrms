package src;

public class SumofArray {

	public Integer findSum(int[] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 6, 3, 2, 1, 5 };

		SumofArray sum = new SumofArray();

		int total = sum.findSum(arr);

		System.out.println("Total .: "+total);
	}

}
