
public class EvenFibonacciNumbers {
	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; fibonacci(i) < 4000000; i++) {
			if(fibonacci(i) % 2 == 0)
				total += fibonacci(i);
		}
		System.out.println(total);
	}
	public static int fibonacci(int max) {
		if(max <= 2) {
			return 1;
		}
		return fibonacci(max -1 ) + fibonacci(max - 2);
	}
}
