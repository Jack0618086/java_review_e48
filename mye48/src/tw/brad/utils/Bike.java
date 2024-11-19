package tw.brad.utils;

import java.io.Serializable;

// 設計類別，使用物件
// 一個類別中只會有一個主類別，一個類別被宣告為public稱為主類別
// public class Bike 這邊是宣告
// {} 大括號內是定義實作
// 屬性就是你會在意的東西 : 腳踏車的速度
// 目前定義在類別總共有三樣東西 : 1.屬性 2.方法 3.建構式
// 一個物件被做出來只會擁有屬性跟方法
public class Bike implements Serializable{
	// protected 繼承的子類別也可去存取
	protected double speed; // 我所設計的腳踏車類別擁有了速度這個屬性
	private int color;

	// 建構式 沒有回傳值不用寫void，方法名稱永遠跟類別名稱大小寫一模一樣 !!!
	// 建構式是在進行物件初始化要做的事，意思是你希望的物件一開始做出來的樣子是怎麼樣
	// 初始化是用來設定物件的初始狀態，通常是在物件創建時伴隨進行的。物件的創建順序是先分配記憶體並生成物件實例，然後執行建構子進行初始化。
	// 建構式不是擁有的觀念只是初始化的時候再做
	public Bike() {
		System.out.println("Bike()");
		color = 1;
	}
	public Bike(int newColor) {
		System.out.println("Bike()");
		color = newColor;
	}
	
	public int getColor() {return color;}

	// void 意思是沒有回傳值
	// upSpeed 方法：用來增加速度。若當前速度小於 1，則速度會設為 1（避免速度低於 1），否則將當前速度乘以 1.4，以達到加速效果。
	// downSpeed 方法：用來減少速度。若當前速度小於 1，則速度會設為 0（避免速度負值），否則將當前速度乘以 0.7，以達到減速效果。
	public void upSpeed() {
		speed = speed < 1? 1 : speed * 1.4;
	}
	public void downSpeed() {
		speed = speed < 1? 0 : speed * 0.7;
	}
	public double getSpeed() {
		return speed;
	}
	
}