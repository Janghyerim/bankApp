
public class Account {
	String ano;
	String owner;
	int balance;
	double rate; //������
	//��ݰ��ɾ�(����)
	int amount; 
	
	
	public Account(String ano, String owner, int balance, double rate) {  //������ ���� �����ϴ� ��� : �ҽ� - ��¡ �ʵ� - �ۺ� üũ
		
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
	
	//�ѱݾ� �����ϴ� �޼ҵ�
	void rateCal() {
		this.amount = balance + (int)(balance * getRate()/100);  //�Ҽ����̹Ƿ� ������ ��Ÿ���� ���� ��Ʈ���� �ٿ��ش�.
	}
	
}
