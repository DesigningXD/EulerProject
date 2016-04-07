import java.util.ArrayList;

public class LargestPrimeFactor {
	public static void main(String[] args) {
		long max = 600851475143L;
		//long max = 13195;
		System.out.println(largest(max));
	}
	public static long largest(long max) {
		ArrayList<Long> array = new ArrayList<>();
		for(long i = max/2112; i >= 1; i--) {
			if(max%i == 0) {
				array.add(i);
				if(Prime(i)) {
					return i;
				}
			}
		}
		System.out.println(array);
		ArrayList x = new ArrayList();
		for(Long y: array) {
			if(Prime(y)) 
				x.add(y);
		}
		return 0;
		
	}
	public static boolean Prime(long array) {
               
                boolean isPrime = true;
               
                //check to see if the number is prime
                for(int j=2; j < array ; j++){
                       
                        if(array % j == 0){
                                isPrime = false;
                                break;
                        }
                }
                return isPrime;
	}
}
