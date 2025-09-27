/*EXERCICIO IV--> Construa uma classe MontadorDeGrid que permita ao usuário preencher um grid numérico de 3x3. O programa deve usar laços
aninhados e Scanner para solicitar um número para cada célula da matriz. Após o preenchimento completo, exiba a matriz no
console, formatada como uma grade com colunas bem alinhadas. */

import java.util.Scanner;

public class MontadorDeGrid{
    public static void main(String[] args){ 
        int [][] matriz = new int[3][3];

    Scanner leia = new Scanner(System.in);
        for(int linha=0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna <matriz.length;coluna++){
                System.out.print("Digite o número na posição: ["+linha+"]["+coluna+"]: ");
                matriz[linha][coluna] = leia.nextInt();
            }
        } 
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz.length; coluna++){
                System.out.print(matriz[linha][coluna]+ " | ");
            }
            System.out.println(); 
        }
        leia.close();
    }
} 



    

