package tw.brad.e48;

public class Brad12_質數練習 {

	public static void main(String[] args) {

		int v = 2;
		boolean isPrime = true;
		for (int i = 2; i< v; i++) {
			if (v % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.printf("%d => %d", v, isPrime?1:0);


//		for (int i = 2; i <= 1000; i++) {
//			boolean isPrime = true;
//			for (int j = 2; j * j <= i; j++) {
//				if (i % j == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			if (isPrime) {
//				System.out.println(i);
//			}
//		}

	}

}
