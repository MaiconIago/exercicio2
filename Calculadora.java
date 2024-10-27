public class Calculadora {
    private int num1;
    private int num2;

    
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    
    public int soma() {
        return num1 + num2;
    }

    public int subtracao() {
        return num1 - num2;
    }

    public int divisao() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return 0; 
        }
    }

    public int multiplicacao() {
        return num1 * num2;
    }
}
