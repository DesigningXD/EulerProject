
public class SecondFile {
	public static void main(String[] args) {
		FuzzBuzz(100);
	}
	public static void FuzzBuzz(int max) {
		for(int i = 1; i <= max; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " FuzzBuzz");
			} else if(i % 3 == 0) {
				System.out.println(i + " Fuzz");
			} else if(i % 5 == 0) {
				System.out.println(i + " Buzz");
			}
		}
	}
}
