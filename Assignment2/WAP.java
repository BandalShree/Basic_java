import java.util.*;
public class WAP{
	public static void main(String []args){
		System.out.println("Enter a number :");
		int num,sum=0,prod=1;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int []arr = new int[num];
		for(int i=0;i<num;i++) arr[i] = sc.nextInt();
		for(int i=0;i<num;i++){
		       	System.out.println(arr[i]*(i+1));
			sum+=arr[i];
			prod*=arr[i];
		}
		System.out.println("Sum of numbers :"+sum+"\nProduct of numbers :"+prod);
	}
}
