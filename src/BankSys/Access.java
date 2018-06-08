package BankSys;
import java.util.Scanner;

public class Access {
	
	
	private int logsit = -1;		// login의 상태를 표시 1 : logon, 0 : logout;
	protected int money = 0;
	protected String FILENAME;	// 고객 Account.txt의 파일
	
	private Scanner keyboard = new Scanner(System.in);
	private BankAcc ba = new BankAcc();	//	고객 Account DB를 다루어줄 BankAcc 객체 생
	
	
	public Access(String AccTxt, int logsit) {
		this.logsit = logsit;
		money = 0;
		FILENAME = AccTxt;	// 객체가 생성될 때, 고객의 파일을 받는다.
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
		this.logsit = 1;
	}
	
	public int logcheck() {
		return this.logsit;
	}

}
