import java.util.Scanner;

public class Gugudan {
	
	
	public static void main(String[] args) {
		
		System.out.println("숫자를 두개를 , 를 이용해 입력하시오 : ");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for(int j= 2; j<= first ; j++) {

			System.out.println(j+"단입니다.");
			
		for(int i =1 ; i<=second; i++) {
			System.out.println(i*j);
		}
		}
			
			 
	}
}