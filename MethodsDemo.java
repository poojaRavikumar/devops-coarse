package firstapp;

public class MethodsDemo {
	int firstNum,secondNum;

		public static void main(String[] args) {

			
			
			new MethodsDemo().takeInput();
		}


		void add(int fNum, int sNum){
			firstNum=fNum;
			secondNum=sNum;

			int result = fNum + sNum;
			displayOutput(result);
		}

		void takeInput(){
			java.util.Scanner scan = new java.util.Scanner(System.in);
            System.out.println("enter the first number and second number");
			int firstNum = scan.nextInt();
			int secondNum = scan.nextInt();

			add(firstNum, secondNum);
		}

		void displayOutput(int result){
			System.out.println("Addition : " + result);
		}




	}

