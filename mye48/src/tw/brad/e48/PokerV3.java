package tw.brad.e48;

import java.util.Arrays;

public class PokerV3 {

	public static void main(String[] args) {
		int nums = 52;
		int[] poker = new int[nums];	// index => int, > 0 
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i = nums -1; i > 0; i--) {
			int rand = (int)(Math.random()*(i+1));
			// poker[rand] <-> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
//		for(int card : poker) {
//			System.out.println(card);
//		}
		
		System.out.println("------");
		int[][] players = new int[4][13];
		for (int i=0; i<poker.length; i++) {
			// i % 4：這部分的值可以是 0 到 3，代表四位玩家，確保每位玩家輪流收到一張牌。
			// i / 4：這部分的值是 0 到 12，代表每位玩家依序拿到 13 張牌的位置。
			// i % 4：表示這張牌應該分給哪個玩家（值在 0 到 3 之間循環）。
			// i / 4：表示這位玩家的第幾張牌（從 0 到 12）。
			players[i%4][i/4] = poker[i];
		}
		
		String[] launchs = {"黑桃","紅心","方塊","梅花"};
		String[] values = {"A ","2 ","3 ","4 ","5 ","6 ","7 "
				,"8 ","9 ","10","J ","Q ","K "};
		for(int[] player : players) {
			// Arrays.sort(player);：將每位玩家的手牌排序，這樣可以讓手牌按數值顯示，從小到大排列。
			Arrays.sort(player);
			for (int card : player) {
				System.out.print(launchs[card/13] + values[card%13] + " ");
			}
			System.out.println();
		}
	}
}