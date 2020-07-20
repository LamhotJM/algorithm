package lab1.prob1.gcd;

/**
 * Created by lamhotsiagian on 7/5/20.
 *
 */

public class GCDBasic {

	public static int computegcd(int m, int n) {
		
		int smaller = m > n ? n: m;
		int gcd = 1;
		for (int i =2; i <= smaller; i ++){
			if ( m % i == 0 && n % i == 0){
				gcd = i;
			}
		}
		return gcd;
	}
	public static void main(String[] args) {
		
		System.out.println(GCDBasic.computegcd(12, 20));
	}
}
