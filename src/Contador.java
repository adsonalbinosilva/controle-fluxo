import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {

			System.out.print("Digite o primeiro parâmetro: ");
			int parametroUm = terminal.nextInt();
			System.out.print("Digite o segundo parâmetro: ");
			int parametroDois = terminal.nextInt();

			try {
				contar(parametroUm, parametroDois);

			} catch (ParametrosInvalidosException e) {
				System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			}
		} catch (InputMismatchException e) {
			System.out.println("ERRO - Digite apenas números inteiros " + e.getLocalizedMessage());
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		int total = parametroDois - parametroUm;
		int contagem = 1;

		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		if (parametroUm < 0 || parametroDois < 0) {
			throw new ParametrosInvalidosException();
		}
		System.out.printf("\nTotal de números a serem impressos: %d\n", total);
		for (int i = parametroUm + 1; i <= parametroDois; i++) {
			System.out.printf("Imprimindo o %dº número é %d\n", contagem++, i);
		}
	}
}