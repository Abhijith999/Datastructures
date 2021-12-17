package array;
import java.util.Scanner;
public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the elements");
for(int i=0; i<n; i++ ) {
	a[i]=sc.nextInt();
}
int temp, j;
for(int i=1; i<n; i++) {
	temp=a[i];
	j=i;
	while(j>0 && a[j-1]<temp) {
		a[j]=a[j-1];
		j=j-1;
	}
	a[j]=temp;
}
System.out.print(" printed elements are:"+ " ");
for(int i=0; i<n; i++) {
	System.out.print(a[i]+ " ");
}
	}

}
