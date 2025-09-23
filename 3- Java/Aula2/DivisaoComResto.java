public class DivisaoComResto {
    public static void main(String[] args) {
        int totalDeItens = 17;
        int capacidadeDaCaixa = 5;
        int resto = totalDeItens % capacidadeDaCaixa;
        int divisao =totalDeItens/capacidadeDaCaixa;
        System.out.println("Serão preenchidas "+ divisao + " Caixas");
        System.out.println("Sobrarão "+ resto + " Itens");
    }
    
}
