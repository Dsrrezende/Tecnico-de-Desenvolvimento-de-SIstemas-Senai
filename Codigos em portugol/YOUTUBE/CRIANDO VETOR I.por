
programa {

  funcao inicio() {
  //Declaração de variáveis
  inteiro numero[5]
  inteiro i  
  //Input
  para(i=0;i<5;i++){
    escreva("Digite o ",i+1,"º Número: ")
    leia(numero[i])
  }
  limpa()
  //Output
  escreva("Dados do Vetor\n")
  para(i=0;i<5;i++){
  escreva(numero[i],"\n")
  }
  }
}
