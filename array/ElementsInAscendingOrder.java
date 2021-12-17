package array;

public class ElementsInAscendingOrder {
	public static void main(String[]args) {
		int arr[]= {5, 6, 9, 100, 988};
		int leastNumber = arr[0];
		System.out.println("Ascending order of the element is");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<leastNumber) {
				leastNumber=arr[i];
				
			}
		
		System.out.print(+ leastNumber);
		leastNumber=leastNumber+1;
	}


	}
}
