/**Execicios vetores youtube--> Dado um vetor de números inteiros 
 * de 5 elementos, apresentar a soma e a média dos valores bem 
 * como qual o maior e o menor valor contido no vetor. Para os testes 
 * vamos inicializar o vetor com os seguintes valores: 5,2,12,15,8
 * Soma=42,média=8,42, maior=15, menor =2
 */
programa {
  funcao inicio() {
    //Declaração de variáveis
    inteiro vet[5] ={5,2,12,15,8}
    real media
    inteiro i,soma=0, maior, menor

    menor = vet[0]
    maior = vet[0]
    //processamento
    para(i=0;i<5;i++){
      soma = soma + vet[i]
      //maior
      se(maior < vet[i]){
        maior = vet[i]
      }
      //menor
      se( menor>vet[i]){
        menor=vet[i]
      }
    }
    media = soma/5
    
    escreva("Soma = ",soma,"\n")
    escreva("Média = ",media,"\n")
    escreva("Menor = ",menor,"\n")
    escreva("Maior = ",maior,"\n")
  }
}
