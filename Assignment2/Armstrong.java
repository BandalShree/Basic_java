import java.util.*;
import java.lang.*;
public class Armstrong{
	public static int CountDigit(int num){
		int digitCount = 0;
		do digitCount++; while((num/=10)!=0);
		return digitCount;
	}
	public static void main(String []args){
                int num;
                Scanner sc = new Scanner(System.in);
                System.out.print("N = ");
                num = sc.nextInt();		
		int numDigit = CountDigit(num);	
		for(int var1=num,var2=0,mod;;num/=10){
			mod = num%10;
			var2+= Math.pow(mod,numDigit);
			if(num/10==0){
				System.out.println(var1+((var1==var2)?" is Armstrong Number":" is Not Armstrong Number"));
				break;				
			}  
	        }
	}
}
