import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //INICIALIZAÇÃO DAS VARIÁVEIS
    int num = 0;
    int i = 1;
    int tot = 0;

    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um número: ");
    num = entrada.nextInt();
    
    while (i <= 10) {
      tot = i * num;
      System.out.println(num + " x " + i + " = " + tot);
      i = i + 1;
    }    
  }
}
