import java.util.*;
public class Swap{
	public static void main(String []args){
		int num1,num2;
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the First Number : ");
		num1 = sc.nextInt();	
		System.out.print("Enter the Second Number : ");
		num2 = sc.nextInt();
		System.out.println("Before Swap : num1="+num1+" num2="+num2);
		//by using + -
		/*num1+=num2;
		num2=num1-num2;
		num1-=num2;*/
		//by using / *
		num1*=num2;
		num2=num1/num2;
		num1/=num2;
		System.out.println("After Swap : num1="+num1+" num2="+num2);

	}
}
