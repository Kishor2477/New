package staticpackage;

class Student{
	int empid;
	String name; 
	static String ceo;
	public void show() {
		System.out.println(empid +":"+ name +":"+ceo);
	}
	static {
		ceo = "Mohan";
	}
	public Student(){
		empid = 00011;
		name = "Laryy";
	}
}




public class SimpleStatic {
	

	public static void main(String[] args) {
		Student ss = new Student();
		ss.empid =16541;
		ss.show();
		

	}

}
