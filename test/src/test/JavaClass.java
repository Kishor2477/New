package test;

public class JavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count = 100,i;
int a,b;
a=5;
b=7;
System.out.println(count);
if (count == 10)
	System.out.println("Count = 10");
else if(count ==100)
	System.out.println("Count = 100");
else
	System.out.println("Count != 100");

switch (count) {
case 10:
	System.out.println("Count = 10");
	break;
case 50:
	System.out.println("Count = 50");
	break;
case 100:
	System.out.println("Count = 100");
	break;
	default:
		System.out.println("Count is != 100");
		break;
}
		for(i=0;i<10;i++) {
			if(i==2 || i==5)
				continue;
			if (i==7)
				break;
			System.out.println(i);
			
		}
		int c = a<b ? a:b;
		System.out.println("max value is "+c);
				
		
}
	

}
