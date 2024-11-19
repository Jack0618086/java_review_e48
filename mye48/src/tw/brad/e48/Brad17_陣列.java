package tw.brad.e48;

public class Brad17_陣列 {

	public static void main(String[] args) {
		int[][] a;
		a = new int[2][3]; // 2x3 二維陣列

		for (int[] v : a) {
			for (int vv : v) {
				System.out.print(vv + " ");
			}
			System.out.println();
		}

		int[][] b = new int[3][];
		b[0] = new int[2]; // 2 的一維陣列
		b[1] = new int[3]; // 3 的一維陣列
		b[2] = new int[4]; // 4 的一維陣列
		System.out.println("---");
		for (int[] v : b) {
			for (int vv : v) {
				System.out.print(vv + " ");
			}
			System.out.println();
		}
		System.out.println("---");

	}
}
