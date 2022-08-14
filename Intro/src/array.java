import java.util.ArrayList;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a = new ArrayList<String>();
a.add("Zero");
a.add("one");
a.add("two");
a.add("three");
System.out.println(a.get(1));

String s1 = new String("Welcome");
String s = "New Year";
String[] splited = s.split(" ");
System.out.println(splited[0]);

String n = "Ragul Sghety";
//for(int i=0;i<n.length();i++)
for(int i=n.length()-1;i>=0;i--)
{
System.out.println(n.charAt(i));
	}

}
}
