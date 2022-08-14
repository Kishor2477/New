
public class Java_Data_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		String word ="Rahul Sheey";
		char letter = 'r';
		double decimel = 5.99;
		boolean value = true;
		System.out.println(num);
		System.out.print(decimel);
		System.out.println(num+ "is the value stored in variable num");
		
		//Array--
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] =2;
		arr[2] =6;
		System.out.println(arr[2]);
		
		//Another Methos for shortcut
		int[] arr6 = {1,2,3,4,5,6};
		System.out.println(arr6[2]);
		
		String[] name = {"Name","one"};
		
		for(int i=0; i<arr6.length; i++)
			
		{
			if(arr6[i]%2 == 0)
			{
			System.out.println(arr6[i]);
			break;
			}
			else
			{
				System.out.println(arr6[i]+ "is not multiple of 2");
			}
		}
		
		//*for(int i=0; i<name.length;i++)
		//{
			//System.out.println(name[i]);
		//}
		//for(String s: name)
			//System.out.println(s);
	
	
	}
	

}
