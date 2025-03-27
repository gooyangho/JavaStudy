package test1w;

public class Qu3Or7Sumdowhile {

	public static void main(String[] args) {
		
		int sum=0;
		int i =1;
		
		do {
			if((i % 3 == 0 || i % 7 == 0) && i % 21 !=0) {
				sum += i;
				System.out.print(i + " ");
			}
		i++;
		}while (i <=100);
		System.out.println("\n합계:" + sum);

	}

}
