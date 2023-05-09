import java.util.*;
public class Pascaltriangle{
	public static void PascalTriangle(int num){
		int [][]arr = new int[num][num];
		if(num>1) arr[0][0]=1;
		if(num>2) { arr[1][0]=1;arr[1][1]=1; }
		for(int i=0;i<num;i++){
			for(int j=0;j<=i;j++) System.out.print(arr[i][j]+" ");
			System.out.println();
			if(i>=1 && i<num-1){
				arr[i+1][0]=1;
				for(int j=1;j<=i;j++)
					arr[i+1][j] = arr[i][j-1]+arr[i][j];
				arr[i+1][i+1] = 1;
			}
		}

	}
	public static void main(String []args){
		int num;
		System.out.print("Enter the number of rows : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		PascalTriangle(num);
	}
}
