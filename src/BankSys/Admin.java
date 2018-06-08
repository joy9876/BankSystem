package BankSys;

public class Admin extends Access {

	public Admin(String AccTxt, int logsit) {
		super(AccTxt, logsit);
	}
	
	public void Desit() {
		
		
		
		System.out.println("Choose the clients: ");
		
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
	
}
