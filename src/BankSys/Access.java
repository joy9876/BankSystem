package BankSys;
import java.util.Scanner;

public class Access {
	
	
	private int logsit;		// login의 상태를 표시 1 : logon, 0 : logout;
	private int money = 0;
	private String FILENAME;
	
	private Scanner keyboard = new Scanner(System.in);
	
	private BankAcc ba = new BankAcc();
	
	
	public Access(String AccTxt) {
		logsit = 0;
		money = 0;
		FILENAME = AccTxt;
	}
	
	public void Desit() {
		
		System.out.print("DEPOSIT: ");
		money = keyboard.nextInt();
		
		ba.deposit(money);
		
	}

	public void Widraw() {
		System.out.print("WITHDRAW: ");
		money = keyboard.nextInt();
		
		ba.withdraw(money);
		
	}

	public void Show() {
		System.out.print("ACCOUNT: ");
		ba.showAll();
	}

	public void Left() {
		System.out.print("LEFT: ");
		ba.showLeft();
	}

	public void logout() {
		this.logsit = 0;
	}
	
	public void login() {
		this.logsit = 0;
	}

}
