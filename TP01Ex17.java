import java.util.Scanner;

//Matheus Penteado e Kaik Persike
// 17. Entrar via teclado com dois valores quaisquer �X� e �Y�. Calcular e exibir o c�lculo XY (�X� elevado a �Y�). Pesquisar as fun��es Exp e Ln.
public class TP01Ex17 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);//Instancia objeto para scanear valores
		
		System.out.println("Digite o valor da base: ");
		double x = scanner.nextDouble();
		
		System.out.println("Digite o valor do expoente: ");
		double y = scanner.nextDouble();
		
		System.out.println("X elevado a Y = " + Math.exp(y * Math.log(x)));			
		
	}
}