import java.util.*;
import java.lang.Math;
public class PowerOfNum
{
        public static void main (String []args)
        {
		Scanner sc=new Scanner(System.in); 
		System.out.print("Number : ");
		int num = sc.nextInt();
		System.out.print("Power : ");
		int pow = sc.nextInt();
		System.out.printf("%d to the power %d is %d",num,pow,getPower(num,pow));
	}
	public static int getPower(int num,int pow)
	{
	int temp=1;
	while(pow--!=0) temp*=num;
	return temp;
	}
	
	
	


}

