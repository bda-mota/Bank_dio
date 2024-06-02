import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		Cliente newCliente = new Cliente();
		newCliente.setNome(name);
		
		InputConta InputConta = new InputConta();
		Conta contaCriada = InputConta.Input(newCliente);

		Print.printOperations();
		int op = scanner.nextInt();
		while (op != 4)
		{
			if (op == 1)
			{
				System.out.println("Enter the value you want to deposit: ");
				double value = scanner.nextDouble();
				contaCriada.depositar(value);
			}
			else if (op == 2)
			{
				System.out.println("Enter the value you want to withdraw: ");
				double value = scanner.nextDouble();
				contaCriada.sacar(value);
			}
			else if (op == 3)
			{
				contaCriada.imprimirExtrato();
				contaCriada.imprimirExtrato();
			}
			else
			{
				System.out.println("Invalid option, try again!");
			}
			Print.printOperations();
			op = scanner.nextInt();
		}
		scanner.close();		
	}

}

/*
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
 */