import java.util.Scanner;

public class ArmNum {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter number");
	int n=scan.nextInt();
	int original=n;
	int count=0;
	while(n!=0) {
		n=n/10;
		count++;
	}
	int res=ArmNumApp.Arm(original,count);
	if(original==res) {
		System.out.println(original+" armstrong number");
	}
	else {
			System.out.println(original+" not armstrong number");
	}
}
}
