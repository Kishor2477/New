package staticpackage;

public class LearnStatic {
	
	public LearnStatic(){
		System.out.println("Hello from Constructor Block");
	}
	
	{
		System.out.println("I'm not static Block");
	}
	
	static {
		System.out.println("Hello");
	}

	
	  public static void main(String[] args) {
		   
		  System.out.println("Hi=");
		  LearnStatic sb1 = new LearnStatic();
		  LearnStatic sb2 = new LearnStatic();
		  }
	 
	public static void staticMethod() {
		System.out.println("Static Method Output");
	}
}
