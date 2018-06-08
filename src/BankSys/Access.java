package BankSys;
import java.util.Scanner;

public class Access {
	
	private int logsit = 1;		// login ���� ���� 1 : logon, 0 : logout;
	private int money = 0;
	private Scanner keyboard = new Scanner(System.in);
	private BankAcc ba = new BankAcc();
	
	
	public Access() {
		
	}
	/*
	public void Desit() {
		
		System.out.print("�󸶳� �����Ͻ� �ǰ���?: ");
		money = keyboard.nextInt();
		
		ba.deposit(money);
		
	}

	public void Widraw() {
		
		System.out.print("�󸶳� �����Ͻ� �ǰ���?: ");
		money = keyboard.nextInt();
		
		ba.withdraw(money);
		
	}

	public void Show() {
		ba.showAll();
	}

	public void Left() {
		ba.showLeft();
	}

	public int check() {
		
		
		
		
		
		return 0;
	}
	
	public void logout() {
		this.logsit = 1;	// logout ���� ����
	}
	*/

}
