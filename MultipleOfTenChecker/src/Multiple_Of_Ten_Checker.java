import java.util.Scanner;

public class Multiple_Of_Ten_Checker {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter number");
	int n1=scan.nextInt();
	int n2=scan.nextInt();
	CheckMultipleOfTen(n1,n2);
	
}
public static void CheckMultipleOfTen(int n1,int n2) {
	
	if(n1%n2==0) {
		System.out.println(n1+" is multiple of "+n2);
	}
	else {
		System.out.println(n1+" is not 3multiple of "+n2);
	}
}
}

 
