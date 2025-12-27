public class Calculaora {
    // Método Calcular
    public static double calcular(double valor1, double valor2, String operacao) {
        switch (operacao) {
            case "+":
                return valor1 + valor2;
            case "-":
                return valor1 - valor2;
            case "*":
                return valor1 * valor2;
            case "/":
                if (valor2 == 0) {
                    throw new ArithmeticException("Divisão por zero não é permitida");
                }
                return valor1 / valor2;
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
        }
    }

    public static void main(String[] args) {
        System.out.println(calcular(10, 5, "+")); // 15
        System.out.println(calcular(10, 5, "-")); // 5
        System.out.println(calcular(10, 5, "*")); // 50
        System.out.println(calcular(10, 5, "/")); // 2
    }
}
