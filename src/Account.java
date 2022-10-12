
public class Account {
	String ano;
	String owner;
	int balance;
	double rate; //이자율
	//출금가능액(이자)
	int amount; 
	
	
	public Account(String ano, String owner, int balance, double rate) {  //생성자 쉽게 생성하는 방법 : 소스 - 유징 필드 - 퍼블릭 체크
		
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.rate = rate;
		
	}
	
	String getAno() {
		return ano;
	}
	
	void setAno(String ano) {
		this.ano = ano;
	}
	
	String getOwner() {
		return owner;
	}
	
	void setOwner(String owner) {
		this.owner = owner;
	}
	
	int getBalance() {
		return balance;
	}
	
	void setBalance(int balance) {
		this.balance = balance;
	}
	
	double getRate() {
		return rate;
	}
	
	void setRate(double rate) {
		this.rate = rate;
	}
	
	int getAmount() {
		return amount;
	}
	
	void setAmount(int amount) {
		this.amount = amount;
	}
	
	//총금액 연산하는 메소드
	void rateCal() {
		this.amount = balance + (int)(balance * getRate()/100);  //소수점이므로 정수로 나타내기 위해 인트형을 붙여준다.
	}
	
}
