package array;
import java.util.Scanner;
public class PrintingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int size,i;
Scanner r=new Scanner(System.in);
System.out.println("Enter the size");
size=r.nextInt();
int[]e arr=new int[size];
System.out.println("Enter the elements to be printed");
for(i=0; i<size; i++) {
	arr[i]=r.nextInt();
	
}
System.out.println("Printed elements are");
for(i=0; i<size; i++) {
	System.out.println(arr[i]);
}
	}

}
