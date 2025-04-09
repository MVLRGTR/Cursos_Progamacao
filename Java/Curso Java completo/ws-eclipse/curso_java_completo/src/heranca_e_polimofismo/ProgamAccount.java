package heranca_e_polimofismo;

public class ProgamAccount {

	public static void main(String[] args) {
		
		Account acc = new Account(1001,"Jõao",0.0);
		BussinesAccount bacc = new BussinesAccount(1002,"Lopes",8500.00,30000.00);
		
		//UPCASTING
		//ESTOU ATRIBUINTO UM OBJETO DA SUB-CLASSE AO DA SUPER CLASSE OU CLASE MAIOR
		Account acc1 = bacc;
		Account acc2 = new BussinesAccount(1003,"Bob",0.0,200.0);
		Account acc3 = new SavingAccounts(1003, "Alana",0.0, 0.01);
		
		//DOWNCASTING
		//NÃO CONSIGO CONVERTER DIRETAMENTE DA SUPER CLASSE PARA A SUB-CLASSE POIS ESSA OPERAÇÃO NÃO É SEGURA POIS GERALMENTE A SUB-CLASSE TEM MAIS PARAMETROS 
		//COMO MOSTRADO NO EXEMPLO ABAIXO, POR MAIS QUE ACC2 TENHA SIDO CONTRUIDA COM BUSSI... ELA FOI ATRIBUIDA A CLASSE ACCOUNT E PARA TER ACESSO AO METODO LOAN PRECISO FAZER O DOWNCASTING
		BussinesAccount acc4 = (BussinesAccount)acc2;
		acc4.loan(100.0);
		
		Account acc10 = new Account(10010,"Alex",1000.0);
		acc10.witdraw(200.0);
		System.out.println(acc10.getBalance());
		
		Account acc11 = new SavingAccounts(10011,"Maria", 1000.0, 0.01);
		acc11.witdraw(200.0);
		System.out.println(acc11.getBalance());
		
		
		Account acc33 = new BussinesAccount(10013,"Bob",1000.0,500.0);
		acc33.witdraw(200);
		System.out.println(acc33.getBalance());
		
		//AS CLASSES COM ABSTRACT NÃO SÃO PERMITIDAS SEREM INSTANCIADAS , OU SEJA SOMENTE A SUAS SUB-CLASES ESPECIFICAS 
		// A MESMA COISA ACONTECE COM OS METODOS ABSTRADOS QUE NÃO PODEM SER IMPLEMENTADOS PELO SUPER CLASSE SOMENTE PELA ESPECIFICAS
	}

}
