import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		
		/* 특정 단수만 출력 하는 방법
		 * System.out.println("보고싶은 단 수를 입력하시오"); Scanner scanner = new
		 * Scanner(System.in); int number = scanner.nextInt();
		 * 
		 * if(number < 2) System.out.println("2이상의 숫자를 입력하시오"); else if(number > 9)
		 * System.out.println("9 이하의 숫자를 입력하시오"); else for(int i = 1 ;i < 10 ; i++) {
		 * int result = number*i; System.out.println(number + "*" + i + "=" + result); }
		 */
		/*
			모든 구구단 출력
		*/
		
		int[] result = new int[9];
		
		for(int number = 2; number <10;number++) {
			System.out.println("");
			System.out.println(number+"단입니다");
			for(int i =0; i < result.length; i++) {
			result[i] = number *(i+1);
			System.out.print(result[i]+"  ");
			}
		}
	}
}
