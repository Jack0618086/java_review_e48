package tw.brad.e48;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Brad23 extends JFrame{
	// 這裡只是宣告了三個按鈕物件的參考變數 b1、b2 和 b3，但它們還沒有被真正建立。
	private JButton b1, b2, b3;

	// Brad23是建構式，用於初始化 Brad23 類別的物件
	// this：存取 本身類別 的成員（資料成員、函數成員、建構元）
	// super：存取 父類別 的成員（資料成員、函數成員、建構元）
	public Brad23() {
		super("我的視窗程式"); // 呼叫父類別（可能是 JFrame）的建構子，並設定視窗的標題為「我的視窗程式」。

		// 產生物件並初始化文字
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");

		setLayout(new FlowLayout()); // 設定佈局方式
		add(b1); add(b2); add(b3); // 加入按鈕到視窗

		// 設定視窗大小與行為
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Brad23(); // // 啟動視窗程式
	}

}
