package javacodes;

public class FibanocciSeriesNew {

	public static void main(String[] args) {
		int firstnum = 0,secondnum =1,num,count = 10;
		System.out.println(firstnum);
		System.out.println(secondnum);
		for(int i = 2; i<count;i++) {
			num = firstnum+secondnum;
			System.out.println(num);
			firstnum = secondnum;
			secondnum = num;
		}

	}    


}
