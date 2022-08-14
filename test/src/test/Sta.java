package test;

public class Sta {
	
	//static variable or class variable
	static int num = 10;
	
	//initializing class variable
	
	static {
		num ++;
		System.out.println("first static block"+num);
	}
	
	//instance Object Constructor
	public Sta(){
		num ++;
		System.out.println("cons"+num);
	}

//instance methods
	public void getItem() {
		num ++;
		System.out.println("Instance Method"+num);
	}
	
	//static method
	public static void getCus() {
		num ++;
		System.out.println("Static Method Method"+num);
	}
	//main Method
	public static void main (String[] args) {
		Sta.num++;
		Sta.getCus();
		Sta sta = new Sta();
		sta.getItem();
		sta.getCus();
		sta.num++;
		System.out.println("Count"+num);
	}
	static {
		num++;
		System.out.println("Second block"+num);
	}
}
