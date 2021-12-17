package array;
import java.util.Scanner;
public class segregate01 {

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
int j=0;
for(int i=0; i<n; i++) {
	
	if(a[i]==0) {
	a[j++]=a[i];	
	}
}
while(j<n) {
	a[j++]=1;
}
for(int k=0; k<n; k++) {
	//System.out.print("arrays after segregate:"+ " ");
	System.out.print(a[k]+ ", ");
}
	}

}
