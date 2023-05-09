import java.util.*;
public class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the no. : ");
		int num = sc.nextInt();
		for(int fact=1;num!=0;num--){
			fact*=num;
			if(num==1)
				System.out.println("Factorial of the number is : "+fact);
		}
	
	}
}
