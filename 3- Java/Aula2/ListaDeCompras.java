import java.util.Scanner;

public class ListaDeCompras {
    public static void main(String[] args) {
        String [] listaMercado = new String [1];

        Scanner entrada = new Scanner(System.in);
        for(int lista = 1 ; lista <= listaMercado.length; lista++ ){
            System.out.print("Digite o "+ lista + "º item da lista de supermecado: ");
            listaMercado[lista] = entrada.nextLine();
        }
        entrada.close();
        for()
        System.out.println(listaMercado);
    }
}
