import java.util.Scanner;

//Matheus Penteado e Kaik Persike
// Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.
public class TP01Ex18 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);//Instancia objeto para scanear valores
		
		System.out.println("Digite o valor do dolar em real: ");
		double somaProdutos = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Valor do produto: ");
			double valorProduto = scanner.nextDouble();
			somaProdutos+=valorProduto;
		}
		
		System.out.println("Soma total dos produtos: " + somaProdutos);			
		
	}
}