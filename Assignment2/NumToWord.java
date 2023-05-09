import java.util.*;
public class NumToWord{
	public static void main(String []args){
		System.out.print("Enter a number :");
		//int num,digit=0;
		//num = sc.nextInt();
		Scanner sc = new Scanner(System.in);
		String num = new String();
		num = sc.next();
		String []str = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		//int []arr = new int[10];
		//for(int i=0;num!=0;num/=10,i++,digit++) arr[i]=num%10;
	       	//while(digit--!=0) System.out.print(str[arr[digit]]+" ");	
		for (int i=0;i<num.length();i++) {
			int temp = ((int)num.charAt(i))-48;
			if(temp>=0 && temp<10)
				System.out.print(str[temp]+" ");
			else{
				System.out.println("Invalid Input");
				break;
			}
		}
	}
}
