import java.util.Scanner;
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter length ");
int arr[]=new int[scan.nextInt()];
int sum=0;
for(int i=1;i<=arr.length;i++) {
	sum=sum+i;
}
System.out.println("sum of "+arr.length+" Natural numbers is "+sum);
	}

}
