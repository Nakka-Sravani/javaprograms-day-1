import java.util.Scanner;

public class SquareNumber {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	System.out.println(squareNumber(7));
}
public static int squareNumber(int num) {
	return num*num;
}
}
