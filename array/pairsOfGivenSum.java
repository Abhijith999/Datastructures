package array;
import java.util.Scanner;
public class pairsOfGivenSum {

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
int sum=10;
for(int i=0; i<n; i++) {
	for(int j=i+1; j<n; j++) {
		if(a[i]+a[j]==sum) {
			System.out.println("pair of numbers are:"+a[i]+" , "+a[j]);
		}
	}
}

	}

}
