import java.io.IOException;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("Por favor escolha qual rotina de escolha usar:\n1 -> Minimo\n2 -> Maximo");
    Scanner scan = new Scanner(System.in);
    int rotina = scan.nextInt();
    LerArquivoTeste l = new LerArquivoTeste("p1.txt");
    try {
      Table t = new Table(l.tamanhoArquivo());
      t.criaTabela(l.criarVetor());
      Procs p = new Procs(" 4", t);
      p.setProcs();
      System.out.println("Tempo do programa: " + p.getTempoTotal());
      t.print();
    } catch (IOException e1) {
      e1.printStackTrace();
    }
    scan.close();
    }
}