import java.math.BigInteger;

/* 
* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
* Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class MultiplesOf3And5 {
	public static void main(String[] args) {
		int max = 1000;
		loopingMethod(max);
		arithmeticProgressionMethod(max);
		System.out.println(TotalSumDivisibleBy(max));
	}
	public static void loopingMethod(int max) {
			int total = 0;
			for(int i = 0; i < max; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					total += i;
				} else if(i % 3 == 0) {
					total += i;
				} else if(i % 5 == 0) {
					total += i;
				}
			}
			System.out.println(total);
	}
	
	public static void arithmeticProgressionMethod(int max) {
		long three = (max-1)/3;
        long five = (max-1)/5;
        long fifteen = (max-1)/15;
        long total = 3*(three*(three+1)/2) + 5*(five*(five+1)/2) - 15*(fifteen*(fifteen+1)/2);
        BigInteger sum = new BigInteger(String.valueOf(total));
        System.out.println(sum);
	}
	public static int TotalSumDivisibleBy(int max) {
		max -= 1;
		return SumDivisibleBy(max,3) + SumDivisibleBy(max, 5) - SumDivisibleBy(max, 15);
	}
	public static int SumDivisibleBy(int max, int n) {
		int p = max / n;
		return n*(p*(p+1)) / 2;
	}
}
