public class MultiplicaAi {

  public static void main(String[] args) {
    int numero = Integer.parseInt(args[0]);

    System.out.println("Tabela de multiplicação de "+numero);

    for (int i = 0; i <= 10; i++){
      System.out.println(i+" x "+numero+" = "+i*numero);
    }
  }
}
