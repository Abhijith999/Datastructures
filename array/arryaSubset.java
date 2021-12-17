package array;
import java.util.HashSet;

public class arrSubset {
 boolean isSubset(int arr1[], int arr2[], int m, int n) {
	HashSet<Integer>hset=new HashSet<>();
	for(int i=0; i<m; i++) {
		if(!hset.contains(arr1[i])) {
			hset.add(arr1[i]);
		}
	}
	for(int i=0; i<n; i++) {
		if(!hset.contains(arr2[i])) {
			return false;
		}
		
	}
	return true;
}
public class arraysubset{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrSubset ref=new arrSubset();
	int arr1[]= {1, 2, 3, 4, 5, 6, 7};
	int m=arr1.length;
	int arr2[]= {1, 3, 5};
	int n=arr2.length;
	ref.isSubset();
	}
}

