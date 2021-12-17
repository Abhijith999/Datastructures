package array;
import java.util.Scanner;
public class MissingLetterInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the size");
int n=sc.nextInt();
int a[]=new int[n];
int sum=n*(n+1)/2;
int total=0;
System.out.println("enter the elements");
for(int i=0; i<n-1; i++) {
	a[i]=sc.nextInt();
	total=total+a[i];
}
int missingNumber=sum-total;
System.out.println("Missing Number is:" +missingNumber);
	}

}
