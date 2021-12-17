package array;
import java.util.Scanner;
public class minElement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of the array");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("enter the elements of array");
	for(int i=0; i<size; i++) {
		a[i]=sc.nextInt();
	}
	int sum=a[0];
	for(int i=1; i<size; i++) {
	if(a[i]<sum) {
		sum=a[i];
	}
	}
	System.out.println("minimum element is"+  sum);
}
};
