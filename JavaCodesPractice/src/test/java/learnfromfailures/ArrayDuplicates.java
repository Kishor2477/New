package learnfromfailures;

public class ArrayDuplicates {
public static void main(String[] args) {
	int[] array = {10,12,230,12};
	int length = array.length;
	//System.out.println(length);
	for(int i=0;i<array.length;i++) {
		for(int j=i+1;j<array.length;j++) {
			if(array[i]==array[j]) {
				System.out.println(array[i]);
			}
		}
	}
}
}
