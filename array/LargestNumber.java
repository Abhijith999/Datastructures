package array;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {5, 6, 9, 1000, 988};
int maxNumber = arr[0];
for(int i=0; i<arr.length; i++) {
	if(arr[i]>maxNumber) {
		maxNumber=arr[i];
	}
	
}
System.out.println("the largest number is " + maxNumber);
	}

}
