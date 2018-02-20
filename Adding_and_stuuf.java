package calc_you_later_pkg;

import java.util.Scanner;

public class Adding_and_stuuf {
	
	public static void main(String[] args) {
		
		System.out.println("Gimme your numbers Daddy!!!");
		Scanner scanner = new Scanner (System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Addition(1),subtraction(2),multiplication(3) or Tom Clancy(4)?");
		int OP = scanner.nextInt();
		
		if (OP == 1){
			System.out.println(Addition(b,a));
		}else if (OP ==2){
			System.out.println(Subtraction(b,a));
		}else if (OP ==3){
			System.out.println(Multiplication(b,a));
		}else{
			System.out.println(Division(b,a));
		}
	scanner.close();

}
	public static int Addition(int Num,int Num2){
		return Num*Num2;
	}
		
	public static int Subtraction(int Num,int Num2){
		return Num*Num2;
	}
		
	public static int Multiplication(int Num,int Num2){
		return Num*Num2;
	}
		
	public static int Division(int Num,int Num2){
		return Num*Num2;
	}

}