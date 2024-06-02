import java.util.Scanner;

public class InputConta {

	public Conta Input(Cliente newCliente){
		Scanner scanner = new Scanner(System.in);
		Print.printAccount();
		int option = scanner.nextInt();
		while (option != 1 || option != 2)
		{
			if (option == 1)
			{
				Conta cc = new ContaCorrente(newCliente);
				Print.printCurrentAccount();

				return cc;
			}
			else if (option == 2)
			{		
				Conta poupanca = new ContaPoupanca(newCliente);
				Print.printSavingAccount();
				return poupanca;

			}
				System.out.println("Invalid option, try again!");
				Print.printAccount();
				option = scanner.nextInt();
		}
		return null;
	}
}
