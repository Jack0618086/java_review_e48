package tw.brad.e48;

public class Brad25 {
	public static void main(String[] args) {
		Brad254 obj1 = new Brad254();
	}
}

class Brad251 extends Object {
	Brad251(){
		System.out.println("Brad251()");
	}
}
class Brad252 extends Brad251 {
	Brad252(){
		System.out.println("Brad252()");
	}
	Brad252(int a){
		this();
		System.out.println("Brad252(int)");
	}
}
class Brad253 extends Brad252 {
	Brad253(){
		System.out.println("Brad253(int)");
	}
	Brad253(int b){
		System.out.println("Brad253()");
	}
}

class Brad254 extends Brad253 {
	Brad254(){
		super(4);
		System.out.println("Brad254()");
	}
}