
public class ArmNumApp {
public static int Arm(int n,int count) {
	int res=0;
	while(n!=0) {
		int rem=n%10;
		res=res+(int)Math.pow(rem,count);
		n=n/10;
	}
	return res;
}
}
