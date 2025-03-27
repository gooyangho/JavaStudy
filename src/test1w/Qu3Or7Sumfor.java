package test1w;

public class Qu3Or7Sumfor {

	public static void main(String[] args) {
	 int sum = 0;
	 int i =1;
		for(i =1; i<=100; i++) {
			if((i % 3 == 0 || i % 7 ==0)&& i % 21 !=0) {
				sum += i;
				System.out.print(i + " ");
				
			}
		}
		System.out.println("\n합계:" + sum);
	}

}
