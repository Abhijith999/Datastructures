package array;
import java.util.Scanner;
public class elementsAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the elements");
for(int i=0; i<n; i++) {
	a[i]=sc.nextInt();
}
int temp;
for(int i=0; i<n; i++) {
	for(int j=i+1; j<n; j++) {
		if(a[i] >a[j]) {
			temp=a[j];
			a[j]=a[i];
			a[i]=temp;
		}
	}
}
System.out.println("elements in ascending order is");
for(int i=0; i<n; i++) {
	System.out.print(a[i]+ " ");
}
	}

}
