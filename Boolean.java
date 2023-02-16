package aa;

import java.util.Scanner;

class Boolean {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("input true or false : ");
			String str = input.nextLine();
			
			if(str.equals("true")) {
				System.out.println("[00000001]");
				break;
			} else if(str.equals("false")) {
				System.out.println("[00000000]");
				break;
			} else {
				continue;
				
			}
			
		}
		
	}

}