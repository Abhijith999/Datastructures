package array;
import java.util.Scanner;
public class BubbleSort {
	
		public static void main (String[] args) {
	    int temp;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size =r.nextInt();
		
		int arr[] = new int[size];
		System.out.println(" enter the elements");
		for(int i=0; i<size; i++) {
			arr[i]=r.nextInt();
		}
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length-1; j++){
				if (arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		}
	}

