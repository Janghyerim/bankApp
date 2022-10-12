import java.util.Scanner;

public class BankAppTest {

	public static void main(String[] args) {
		
		BankApp ba = new BankApp();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("===================================");
		System.out.println("========= 은행 업무 관리 시스템 =========");
		System.out.println("===================================");
		
		
			
	        while(true) {
			    ba.info();
				int choice = sc.nextInt();  //메뉴 선택 기능
				
				if(choice == 1) {             //상위 조건문
					ba.createAccount();       //계좌 개설 기능
				}else if(choice == 2) {
					ba.accountList();         //계좌 목록보기 기능
				}else if(choice == 3) {
					ba.deposit();
				}else if(choice == 4) {
					ba.withdraw();
			    }else if(choice == 5){
					System.out.println("시스템을 종료 합니다.");
					break;
                }
	      }
	        System.out.println("시스템을 종료 합니다.");
	}

}
