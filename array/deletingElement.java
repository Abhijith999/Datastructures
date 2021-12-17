package array;
import java.util.Scanner;
public class deletingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the size");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the elements");
for(int i=0; i<n; i++) {
	a[i]=sc.nextInt();
}
System.out.println("enter the element to be removed");
int delete=sc.nextInt();
for(int i=0; i<n; i++) {
	if(a[i]==delete) {
		for(int j=i; j<n-1; j++ ) {
			a[j]=a[j+1];
		}break;
	}
}
for(int i=0; i<n-1; i++) {
	System.out.print(a[i]+ " ");
}


	}

}
