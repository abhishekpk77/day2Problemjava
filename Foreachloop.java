package day2problem;

public class Foreachloop {
int[] display(int[] arr) {
	int j=0;
	for (int i:arr) {
		arr[j]=i+1;
		j++;
	}
	return arr;
}
public static void main(String[] args) {
	Foreachloop obj=new Foreachloop();
	int[] array1;
	int array2[]=new int[5];
	int array3[]= {11,22,33};
	array1=obj.display(array3);
	System.out.println(array1[0]);
	System.out.println(array1[2]);
	}
}

