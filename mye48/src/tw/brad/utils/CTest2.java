package tw.brad.utils;

// CTest2 繼承 CTest1
public class CTest2 extends CTest1 {
	public CTest2() {
		// 所有建構式第一句都是負責把祖宗八代叫出來
		// super(); 預設叫 super
		super(3);
		System.out.println("CTest2()");
	}
}
