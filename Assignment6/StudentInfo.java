import java.util.*;
class StudentInformation {
	private int rollNo;
  	private int sub1Marks;
  	private int sub2Marks;
  	private int sub3Marks;

	public boolean setValue(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll Number : ");
		rollNo = sc.nextInt();
		System.out.print("Enter First Marks : ");
		sub1Marks = sc.nextInt();
		System.out.print("Enter Second Marks : ");
		sub2Marks = sc.nextInt();
		System.out.print("Enter Third Marks : ");
		sub3Marks = sc.nextInt();
		boolean isValid = true;
		if(rollNo<0 || sub1Marks<0 || sub2Marks<0 || sub3Marks<0 || sub1Marks>100 || sub2Marks>100 || sub3Marks>100){
			System.out.println("Please Enter valid Inputs");	
			isValid = false;
		}
		return isValid;
	}

	// Student will pass if minimum marks in each subject is 40 and total marks are atleast 120.
	public boolean isStudentPassed(){
		boolean isPassed = false;
		if(sub1Marks>=40 && sub2Marks>=40 && sub3Marks>=40 && sub1Marks+sub2Marks+sub3Marks>=120)
			isPassed = true;
		return isPassed;
	}

	// Student will fail if marks in any subject is less than 40 and total marks are less than 120.
	public boolean isStudentFailed(){
		boolean isFailed = false;
                if(sub1Marks<40 || sub2Marks<40 || sub3Marks<40 || sub1Marks+sub2Marks+sub3Marks<120)
                        isFailed = true;
                return isFailed;
	}
}
public class StudentInfo{
	public static void main(String []args){
		StudentInformation obj = new StudentInformation();
		if(obj.setValue()){
			System.out.println(obj.isStudentPassed()?"PASSED":"FAILED");
			System.out.println(obj.isStudentFailed()?"FAILED":"PASSED");
		}
	}
}
