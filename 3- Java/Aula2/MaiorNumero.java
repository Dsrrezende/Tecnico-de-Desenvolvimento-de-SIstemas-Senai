/*EXERCICIO III--> Crie uma classe MaiorNumero que analise um conjunto de pontuações. Peça ao usuário para inserir 6 números inteiros, que
podem representar pontuações de um jogo, usando Scanner ou JOptionPane. Armazene esses números em um vetor, processe
os dados para encontrar a maior pontuação e, ao final, exiba o recorde encontrado. */

import javax.swing.JOptionPane;

public class MaiorNumero {
    public static void main(String[] args) {
        int [] pontuacao = new int [3];

        for (int i=0; i<pontuacao.length;i++){
            String numeroStr = JOptionPane.showInputDialog("Entre com o "+( i+1) + "º ponto: ");
            pontuacao[i] = Integer.parseInt(numeroStr);
        }
        int maior = pontuacao[0];
        for ( int i=1 ; i<pontuacao.length;i++){
            if (pontuacao[i] > maior) {
                maior = pontuacao[i];
            }
        }
        JOptionPane.showMessageDialog(null, "O maior ponto digitado foi: " + maior);
    }
}
