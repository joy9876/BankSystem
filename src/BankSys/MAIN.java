package BankSys;
import java.util.Scanner;

public class MAIN {
	
	public static void main(String args[]) {
		
		// 입출력 그룹 
		Scanner keyboard = new Scanner(System.in);
		String ID, PW;
		
		// 변수 그룹
		int option = -1;
		
		// 객체 그룹
		BankId Identi = new BankId();	// ID, PW 인에 필요한 객체이다.
		Access Temp = new Access();				// Access를 통해 Client와 Administer를 이용할 수 있도록 한다.
		
		do {
		System.out.println("----------------Login--------------");
		System.out.print("ID: ");
		ID = keyboard.nextLine();
		System.out.print("PW: ");
		PW = keyboard.nextLine();
		System.out.println("------------------------------------");
	
		Temp = Identi.check(ID, PW);
		}while ( Temp == null);
		
		/***
		if( Temp instanceof Admin ) {
			Ad = (Admin)Temp;
		}
		else if ( Temp instanceof Client ) {
			Cl = (Client)Temp;
		}
		***/
		/***
		while(true) {
			
			System.out.println("------------------------------------------------------------");
			System.out.println("1. Deposit\t2. Withdraw\t3. Show\t4. Left Money\t5. Logout");
			System.out.println("------------------------------------------------------------");
			
			option = keyboard.nextInt();
			
			switch(option) {
			
			case 1:
				Temp.Desit();
				break;
			case 2:
				Temp.Widraw();
				break;
			case 3:
				Temp.Show();
				break;
			case 4:
				Temp.Left();
				break;
			case 5:
				Identi.Init();
				Temp.logout();
				break;
			default:
				System.out.println("Error. Please enter the number again");
				
			
			}
			
			
		}
	***/
		
	}
	
	

}
