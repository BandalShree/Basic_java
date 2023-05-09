import java.util.*;
public class NumToString{
	public static void main(String []args){
		System.out.print("Enter a number :");
		int num,digit=0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		String []str1 = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String []str2 = {"ten","eleven","twelve","thirteen","forteen","fifteen"};
		String []str3 = {"twenty","thirty","forty","fifty"};
		int []arr = new int[10];
		for(int i=0;num!=0;num/=10,i++,digit++) arr[i]=num%10;
	       	while(digit!=0){
			if(digit>3){
		       		System.out.print(str1[arr[digit-1]]+" ");
		     		System.out.print("thousand ");
			}	
			else if(digit>2){
				if(arr[digit-1]!=0){
		       			System.out.print(str1[arr[digit-1]]+" ");
		       			System.out.print("hundred ");
				}
			}
			else if(digit>1){
				if(arr[digit-1]==1){
					if(arr[digit-2]<6)
		       				System.out.print(str2[arr[digit-2]]+" ");
					else
		       				System.out.print(str1[arr[digit-2]]+"teen ");
				}
				if(arr[digit-1]>1){	
					if(arr[digit-1]<6)
		       				System.out.print(str3[arr[digit-1]-2]+" ");
					else
		       				System.out.print(str1[arr[digit-1]]+"ty ");
				}
			}
			else{
				if(arr[digit]>1 && arr[digit-1]>0)
					System.out.print(str1[arr[digit-1]]);
				else if(arr[digit]==0 && arr[digit-1]!=0)
					System.out.print(str1[arr[digit-1]]);
			}
			digit--;
		}
	}
}
