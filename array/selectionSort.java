package array;
import java.util.Scanner;
public class selectionSort {

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
int min, temp=0;
for(int i=0; i<a.length; i++) {
	min=i;
	for(int j=i+1; j<a.length; j++) {
		if(a[j]<a[min]) {
			min=j;
		}
	}
	temp=a[i];
	a[i]=a[min];
	a[min]=temp;
}
System.out.println("printed elements are:"+ " ");
for(int i=0; i<n; i++) {
	System.out.print(a[i]+ " ");
}
	}

}
