import java.util.*;
public class Countonebits
{
	public static int CountOneBits(int num){
		int count=0;
		while(num!=0){
			if(num%10==1) count++;
			num/=10;
		}
		return count;
	}
	public static void main(String[] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter binary number : ");
		num = sc.nextInt();
		int countOneBits = CountOneBits(num);
		System.out.println(countOneBits);
	}
}
