package tw.brad.e48;

public class Brad14_骰子練習 {

	public static void main(String[] args) {
		int p1, p2, p3, p4, p5, p6;
		p1 = p2 = p3 = p4 = p5 = p6 = 0; // 初始化

		for (int i=0; i<100; i++) {
			int point = (int)(Math.random()*6)+1;
			switch(point) {
				case 1: p1++; break;
				case 2: p2++; break;
				case 3: p3++; break;
				case 4: p4++; break;
				case 5: p5++; break;
				case 6: p6++; break;
			}
		}
		
		System.out.printf("%d點出現%d次\n", 1, p1);
		System.out.printf("%d點出現%d次\n", 2, p2);
		System.out.printf("%d點出現%d次\n", 3, p3);
		System.out.printf("%d點出現%d次\n", 4, p4);
		System.out.printf("%d點出現%d次\n", 5, p5);
		System.out.printf("%d點出現%d次\n", 6, p6);
		
	}

}
