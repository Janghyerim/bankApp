import java.util.Scanner;

public class BankApp {
	Account[] acc = new Account[100];  //멤버변수(참조형)  -> 배열에 주소값은 null로 들어가있다.
	Scanner sc = new Scanner(System.in); 
	
	void info() {
		System.out.println("-------------------------------------");
		System.out.println("1.계좌생성  2.계좌목록  3.예금  4.출금   5.종료");
		System.out.println("-------------------------------------");
		System.out.print("선택 : ");
		
	}

	//계좌 생성 기능
	void createAccount() {
		System.out.println("----------");
		System.out.println("계좌 생성 메뉴");
		System.out.println("----------");
		
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		
		if(findAccount(ano) != null) {
			System.out.println("이미 계좌가 존재 합니다.");
			return;
		}
		
		System.out.println("계좌주명 : ");
		String owner = sc.next();
		
		System.out.println("초기 입금액 : ");
		int balance = sc.nextInt();
		
		System.out.println("이자율 입력 : ");
		double rate = sc.nextDouble();
		
		//완성하기
		Account account = new Account(ano,owner,balance,rate);
		
		//출금가능액 공식 따로 만들기
		account.rateCal();
		
		for(int i=0;i<acc.length;i++) {
			if(acc[i] == null) {
				acc[i] = account;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌 목록 기능
	void accountList() {
		System.out.println("-------------");
		System.out.println("계좌 목록보기 메뉴");
		System.out.println("-------------");
		
		System.out.println("계좌번호   계좌주  입금액   이자율   출금가능액(이자)");
		
		for(int i=0;i<acc.length;i++) {
			if(acc[i] == null) {
				break;
			}
			System.out.println(acc[i].getAno()+"   "+acc[i].getOwner()+"   "+acc[i].getBalance()+"   "+acc[i].getRate()+"%   "+acc[i].getAmount());
		}
	}
	
	//예금 기능
	void deposit() {
		System.out.println("-------------");
		System.out.println("예금 기능 메뉴");
		System.out.println("-------------");
		
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		
		System.out.println("예금액 : ");
		int balance = sc.nextInt();
		
		//완성기능
	    Account account = findAccount(ano);
	    
	    if(account == null) {
	    	System.out.println("계좌번호가 존재 하지 않습니다.");
	    	return;  //종료 기능 break와 같음.
	    }
	    
	   account.setBalance(account.getBalance() + balance);
	   System.out.println("예금 처리가 정상적으로 완료 되었습니다.");
	}
		
	
	//출금 기능
    void withdraw() {
    	System.out.println("-------------");
		System.out.println("출금 기능 메뉴");
		System.out.println("-------------");
		
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		System.out.println("출금액 : ");
		int balance = sc.nextInt();
		
		//완성기능
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("계좌번호가 존재 하지 않습니다.");
			return;  //종료 기능 break와 같음.
		}
		
		if(account.getBalance()<balance) {
			System.out.println("출금액이 부족합니다.");
			return;
		}
		account.setBalance(account.getBalance() - balance);
		System.out.println("출금 처리가 정상적으로 완료 되었습니다.");
		
    }	
	
	//완성기능
    //계좌 찾기 (공통기능)
	
	Account findAccount(String ano) {
		
		Account account = null;
		
		for(int i=0;i<acc.length;i++) {
			if(acc[i] != null) {
			if(acc[i].ano.equals(ano)) {  //.equals() : 문자타입 비교할때 쓰는 비교문
				account = acc[i];
				break;  //반복문에만 써야된다.
			  }
		   }
		}
		return account;
	}
}
