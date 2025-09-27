/*EXERCICIO II--> Desenvolva uma classe CalculadoraDeMediaVetor para calcular a média de um aluno. Utilizando Scanner, o programa deve
solicitar as 4 notas bimestrais, armazenando-as em um vetor de double. Após a inserção de todas as notas, calcule a média final
e exiba o resultado formatado com duas casas decimais. */

import java.util.Scanner;

public class CalculadoraDeMediaVetor {
    public static void main(String[] args) {
        double [] notas = new double[1]; 
        double  media = 0;

        Scanner leia = new Scanner(System.in);
        for (int nota = 0; nota <notas.length;nota++){
            System.out.print("Digite a "+ (nota + 1) + "ª nota bimestral: ");
            notas[nota] = leia.nextDouble();
            media += notas [nota]/4; // ou media = media + notas [nota]/4;
        }
        System.out.printf("Sua média final é %.2f" , media);
        leia.close();
    }
}
