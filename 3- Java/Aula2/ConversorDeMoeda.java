public class ConversorDeMoeda {
    public static void main(String[] args) {
        double valorEmDolar = 100;
        double taxaDeCambio = 5.25;
        double reais = valorEmDolar*taxaDeCambio;

        System.out.println("O valor em Reais (R$) é: "+reais);
    }
}
