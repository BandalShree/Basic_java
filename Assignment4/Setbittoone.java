import java.util.*;
public class Setbittoone
{
	public static int CountDigit(int num){
		int count=0;
		while(num!=0){
			count++;
			num/=10;
		}
		return count;
	}
	public static int Reverse(int num){
		int rev=0;
		while(num!=0){
		       rev=rev*10+num%10;
		       num/=10;
		}
		return (rev);
	}
	public static int SetBitToOne(int num,int bitPosition){
		int temp=1;
		for(int i=CountDigit(num),j=0;num!=0;j++,num/=10){
			temp*=10;
			if(j==i-bitPosition-1) temp+=1;
			else temp+=num%10;
		}
		return Reverse(temp);
	}
	public static void main(String[] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter binary number : ");
		num = sc.nextInt();
		System.out.print("Enter bit position : ");
		int bitPos = sc.nextInt();
		System.out.println(SetBitToOne(num,bitPos)/10);
	}
}
