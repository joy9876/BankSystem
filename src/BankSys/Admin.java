package BankSys;

public class Admin extends Access {
	
	private int logsit = 1;		// login ���� ���� 1 : logon, 0 : logout;
		
	
	public void logout() {
		this.logsit = 1;	// logout ���� ����
	}
}