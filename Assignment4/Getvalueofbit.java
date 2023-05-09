import java.util.*;
public class Getvalueofbit
{
	public static int CountDigit(int num){
		int count=0;
		while(num!=0){
			count++;
			num/=10;
		}
		return count;
	}
	public static int GetValueOfBit(int num,int bitPosition){
		int temp=0;
		for(int i=CountDigit(num),j=0;num!=0;j++,num/=10) if(j==i-bitPosition-1) temp=num%10;
		return temp;
	}
	public static void main(String[] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter binary number : ");
		num = sc.nextInt();
		System.out.print("Enter bit position : ");
		int bitPos = sc.nextInt();
		System.out.println(GetValueOfBit(num,bitPos));
	}
}
