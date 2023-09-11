public class operadoresRelacionais {
    public static void main(String[] args) {
      // A forma mais recomendada para OBJETOS é utilizar o EQUALS e PARA numeros utilizar operadores RELACIONAIS
        String nomeUM = "Jeferson";
        String nomeDois = new String("Jeferson");

    System.out.println(nomeUM.equals(nomeDois));
      
      
    
        int numeroUm = 7;
      int numeroDois = 6;

      if(numeroUm == numeroDois){
      System.out.println("a nossa condição é verdadeira!");
     
      }

        boolean simNao = numeroUm == numeroDois;

        System.out.println("O numero um é igual que o numero dois ? " + simNao);
 
          simNao = numeroUm != numeroDois;
 System.out.println("Numero um é diferente do numero dois? " + simNao);

  simNao = numeroUm > numeroDois;
  System.out.println("Numero 1 é maior que o numero 2? " + simNao);


      }
}