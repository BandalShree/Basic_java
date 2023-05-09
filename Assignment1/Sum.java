import java.util.*;
public class Sum{
        public static void main(String []args){
                int num1,num2;
                Scanner sc = new Scanner(System.in);
                System.out.print("N = ");
                num1 = sc.nextInt();
                System.out.print("M = ");
                num2 = sc.nextInt();
		if(num1>num2) num1 = (num1+num2)-(num2=num1);
		for(int i=num1;i!=num2;num1+=num2,num2--);
		System.out.println("Sum = "+num1);       
	}
}

