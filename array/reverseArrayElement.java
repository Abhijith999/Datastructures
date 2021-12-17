package array;

public class reverseArrayElement {

	public static void main(String[] args) {
		int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int low=0,  high=a.length-1;
		int temp;
		//for(int i=0; i<a.length; i++) {
			
		
while(low!=high) {
	temp=a[low];
	a[low]=a[high];
	a[high]=temp;
	low++; high--;
	//System.out.print();
}
for(int i=0; i<a.length; i++) {
	System.out.print(a[i]+ " ");
}
		
}
	}


