package tw.brad.e48;

public class Brad15_骰子練習延伸 {

	public static void main(String[] args) {
		int[] p = new int[6];	// p[0], ... p[5]

		// 提高 4/5/6 點出現的次數
		for (int i=0; i<100000; i++) {
			int point = (int)(Math.random()*9);	// 0,1,2,3,4,5, 6,7,8
			p[point<6?point:point-3]++;
		}

		// 是使用三元條件運算子來決定使用哪個索引來增加對應的計數。讓我們拆解這段程式碼：
		//
		//point < 6 ? point : point - 3：
		//
		//這是一個三元條件運算式（ternary operator），其語法為：(條件) ? 表達式1 : 表達式2。
		//如果 point < 6 為 true，則取 point 作為索引；
		//如果 point < 6 為 false，則取 point - 3 作為索引。
		//目的：
		//
		//如果 point 是 0 到 5，則 p[point]++，對應陣列中的前六個位置，分別代表骰子的點數 1 到 6。
		//如果 point 是 6, 7, 或 8，則 point - 3 會將其值調整為 3, 4, 或 5，所以在 p 陣列中索引為 3, 4, 5 的位置會被增加，這樣就增加了 p[3], p[4], 和 p[5] 的計數。
		//這段程式碼的結果是當 point 取值超過 5 時，會把 6, 7, 8 都映射到 3, 4, 5，所以索引 3, 4, 5 的值（即點數 4, 5, 6）的出現次數會變高。


		for (int i=0; i<p.length; i++) {
			System.out.printf("%d點出現%d次\n", (i+1), p[i]);
		}
		
	}

}
