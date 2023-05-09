import java.util.*;
public class Reverse{
	public static void main(String []args){
                int num;
                Scanner sc = new Scanner(System.in);
                System.out.print("N = ");
                num = sc.nextInt();
		if(num==0) System.out.println(num);
		for(;num!=0;System.out.print(num%10),num/=10);
        }
}

