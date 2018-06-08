package BankSys;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.io.BufferedReader;

import java.util.Scanner;

public class Admin extends Access {
	
	private String CliStr;	// 고객 이름
	private Scanner keyboard = new Scanner(System.in);
	private String Filename;

	public Admin(String AccTxt, int logsit) {
		super(AccTxt, logsit);
	}
	
	// 고객 이름을 출력한다.
	public void ClientPrint() {
		
		Path fp = Paths.get("/Users/kimhyeongseon/Desktop/Git/BankSystem/IdentiDB.txt");
		//입력 버퍼에서 받을 파일 주소를 입력한다.
		
		try(BufferedReader br = Files.newBufferedReader(fp)) {
			// 파일 읽기 포인터를 생성한다.
			String str;
			int count = 1;
			
			while(true) {
				str = br.readLine();
				if(str == null)
					break;
				String[] strip = new String[3];
				strip = str.split(", ");
				
				
				// 파일 끝에서 while문 종료
				
				System.out.println(count++ +": " + strip[1]);
				// 고객 정보 인출 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/*public Client ClientInfo() {
		
	}*/
	
	public String NametoAccTxt(String CliStr) {
		
		
		
		return Filename;
	}
	

	
	public void Desit() {
		
		ClientPrint();
		
		System.out.println("Choose the clients: ");
		CliStr = keyboard.nextLine();
	 	Filename = NametoAccTxt(CliStr);
		
		
		System.out.print("DEPOSIT: ");
		money = keyboard.nextInt();
		keyboard.nextLine();
		
		//ba.deposit(user,money);
		
	}

	public void Widraw() {
		
		ClientPrint();
		
		System.out.println("Choose the clients: ");
		CliStr = keyboard.nextLine();
		
		System.out.print("WITHDRAW: ");
		money = keyboard.nextInt();
		
		//ba.withdraw(user, money);
		
	}

	public void Show() {

		ClientPrint();
		System.out.println("Choose the clients: ");
		CliStr = keyboard.nextLine();
		
		System.out.print("ACCOUNT: ");
		
		//ba.showAll();
	}

	public void Left() {
		
		ClientPrint();
		System.out.println("Choose the clients: ");
		CliStr = keyboard.nextLine();
		
		System.out.print("LEFT: ");
		//ba.showLeft();
	}
	
}
