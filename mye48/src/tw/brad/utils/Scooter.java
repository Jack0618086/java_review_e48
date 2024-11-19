package tw.brad.utils;

// Scooter 準備將 Bike 發揚光大
public class Scooter extends Bike {
	public void upSpeed() {
		speed = speed < 1? 1 : speed * 1.7;		
	}
}
