package tw.brad.e48;

public class Brad18_while迴圈 {

	public static void main(String[] args) {
		// 1 + 2 + ... + n = ?
		int i = 1;
		int sum = 0;
		int n = 100;
		while (i <=n) {
			sum += i;	// 1 + 2 + 3 + ... + 8 + 9 + 10
			i++;
		}
		System.out.printf("1 + 2 + ... + %d = %d\n", n, sum);
		System.out.println("---");

		i = 1;
		sum = 0;
		n = 50; // 設定加總的終止數值，即從 1 加到 50。
		// i = 1 已在外部初始化
		// 遞增部分（在迴圈體內處理）
		for (;i <=n;) {
			sum += i++;
		}
		System.out.printf("1 + 2 + ... + %d = %d\n", n, sum);
	}

}
