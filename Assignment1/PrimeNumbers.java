import java.util.*;
import java.lang.*;
public class PrimeNumbers{
        public static void main(String []args){
                int num1,num2;
		Scanner sc = new Scanner(System.in);
                System.out.print("N = ");
                num1 = sc.nextInt();
                System.out.print("M = ");
                num2 = sc.nextInt();
		if(num1>num2) num1 = (num1+num2)-(num2=num1);
		if(num2<2) System.out.println("No Prime Numbers found");
		if(num1<2) num1=2;
		System.out.print("Prime Numbers = ");
		if(num1==2) System.out.print("2 ");
		if(num1%2==0) num1++;	  
		for(int i=3,temp=(int)Math.sqrt((double)num1);num1<=num2;num1+=2,i=3,temp=(int)Math.sqrt((double)num1)){
			if(num1<8) System.out.print(num1+" ");
			else{
				for(;i<=temp;i+=2)
					if(num1%i==0)
						break;			    	
				if(i>temp)
			    		System.out.print(num1+" ");
			}
		}
	}
}

