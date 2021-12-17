package array;
import java.util.Scanner;
public class BinerySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements");
		
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be search");
		int srch=sc.nextInt();
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		while(li<=hi) {
			if(a[mi]==srch) {
				System.out.println("Element is at "+mi+" index position"  );
				break;
			}
			else if(a[mi]<srch) {
				li=mi+1;
			}
			else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
	} 
		if(li>hi) {
			System.out.println("Element not found");
		}

}
}