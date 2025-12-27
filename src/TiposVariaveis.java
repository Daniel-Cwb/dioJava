public class TiposVariaveis {
    public static void main(String[] args) {
        // Tipos primitivos int, byte, short, long, float, double e char
        byte idade      = 123;
        short ano       = 2025;
        int cep         = 81170755;
        long cpf        = 98765432109L; // Se começão com Zero melhor usar string
        float pi        = 3.14F; // Colocar o F no final
        double salario  = 1275.33;

        // Se tenho um valor Ex:
        int numero = 1;
        short numero2 = (short ) numero; // Tenho que fazer um cast pq numero e int e não deixa eu passar um valor int e uma variavel short

        final double VALOR_DE_PI = 3.14; // Variavel nunca vai mudar seu valor

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado vindo do Método: " + primeiroNome + " " + segundoNome;
    }
}
