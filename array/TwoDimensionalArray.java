package array;
import java.util.Scanner;
public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][] = new int[3][4];
Scanner scanner = new Scanner (System.in);
System.out.println("Enter the Elements"); 
for(int i=0; i<3; i++) {
for(int j=0; j<4; j++) {
	arr[i][j]=scanner.nextInt();
}
}
for(int i=0; i<3; i++) {
for(int j=0; j<4; j++) {
System.out.print(arr[i][j]+ " ");
}
}
	}
}
