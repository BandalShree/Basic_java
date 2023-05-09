import java.util.*;
import java.lang.Math;
public class CompoundInterest
{
        public static void main (String []args)
	{
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter Principal Amount : ");
	float principal=sc.nextFloat();
	System.out.print("Enter Rate Of Interest : ");
	float rate=sc.nextFloat();
	System.out.print("Enter Time Period : ");
	float time=sc.nextFloat();
	System.out.printf("Compound Interest is : %.2f ",giveCompoundInterest(principal, rate, time));
	}
	
	public static float giveCompoundInterest(float principal, float rate, float time)
	{
	return principal*(float)Math.pow((1+rate/100),time);
	
	}	

}
