package ex06Array;

public class E05TwoDimArray01 {

	public static void main(String[] args) {
			
		int[] arr2 =new int[5];
		arr2[0] = 1;
		//배열명을 출력하면 참조값이 나온다
		System.out.println("arr2 배열명 출력:" + arr2);
		//0번 인덱스는 1이 출력됨
		System.out.println("arr2[0] 배열명 출력:" + arr2[0]);
		//초기화 하지 않은 원소는 0이 출력된다.
		System.out.println("arr2[3] 배열명 출력:" + arr2[3]);
		
		/*
		아래와 같이 2차원배열을 초기화하면 3행(세로), 4열(가로)인
		배열이 생성된다.  초기화 할 원소가 없는 부분은 null로 채워진다.
		※null값 : 아무것도 없는ㄱ밧을 일컫는다. 즉 빈값을 말한다.
			스페이스와 같은 공백문자 혹은 0과는 다르므로 명확한 의미를
			알고 있어야 한다.
		 */		
		
		int[][] arr = {
				{1,2},
				{3,4,5},
				{6,7,8,9}
		};
		
		//1차원배열을 선언한 후 0번 원소만 초기화한다.
		
		/*
		2차원 배열에서는 "배열변수"length"를 통해 행의 크기를
		확인할 수 있다.	 */
		System.out.println("배열의 세로크기:" + arr.length);
		System.out.println("배열명이 가진값 출력(arr):" + arr);
		//각 행의 크기를 출력하기 위해 반복
		for(int i=0 ; i<arr.length ; i++) {
			//2차원배열에서는 각 행의 크기를 "배열명[인덱스]"를 사용
			System.out.printf("%d행의크기:%d\n", i,
					arr[i].length);
			//각 행의 참조값을 출력
			System.out.printf("%d행 출력:%s\n" , i, arr[i]);
		}
		System.out.println("배열 출력하기");
		System.out.println("arr[0][1]="+arr[0][1]);
		System.out.println("arr[0][3]="+arr[0][3]);
	}
}