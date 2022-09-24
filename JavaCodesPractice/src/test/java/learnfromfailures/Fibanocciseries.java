package learnfromfailures;

public class Fibanocciseries {

	public static void main(String[] args) {
		//011235
		int firstnum =0,secondnum= 1,count =10,sum;
		System.out.println(firstnum);
		System.out.println(secondnum);
		for(int i=2;i<count;i++) {
			sum =firstnum+secondnum;
			System.out.println(sum);
			firstnum = secondnum;
			secondnum =sum;
		}
	}
}
