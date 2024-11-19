package tw.brad.e48;

public class Brad16_foreach迴圈 {

	public static void main(String[] args) {
		int[] a = {1,3,2,7,4,8};
		
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("---");
		
		// for-each 的優點
		// 1. 更簡潔：不需要宣告和遞增索引變數，只需要直接處理元素本身。
		// 2. 減少錯誤：不需要擔心索引超出陣列範圍的情況。
		// 3. 可讀性更高：更容易理解其意圖是遍歷每個元素。
		// int v : a 表示每次迴圈執行時，會將陣列 a 中的下一個元素賦值給 v

		for (int v : a) {
			System.out.println(v);
		}
		
	}

}
