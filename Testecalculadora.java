import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String operador;

        while (true) {
            System.out.print("Digite um operador (+, -, *, /) ou '.' para sair: ");
            operador = scanner.nextLine();

            if (operador.equals(".")) {
                break; 
            }

            System.out.print("Digite o primeiro número: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite o segundo número: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            Calculadora calc = new Calculadora(num1, num2);

            switch (operador) {
                case "+" -> System.out.println("Resultado: " + calc.soma());
                case "-" -> System.out.println("Resultado: " + calc.subtracao());
                case "/" -> {
                    int resultado = calc.divisao();
                    if (resultado != 0) { 
                        System.out.println("Resultado: " + resultado);
                    }
                }
                case "*" -> System.out.println("Resultado: " + calc.multiplicacao());
                default -> System.out.println("Operador inválido.");
            }
        }

        scanner.close(); 
        System.out.println("Programa encerrado.");
    }
}
9