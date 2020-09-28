import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;

public class App {
  public static String escolheTxt(){
    Scanner entrada = new Scanner(System.in);
    int menu = 0;
    String arq  = "";
    System.out.println("\n>>>>>>>>>>> Escolha uma dos casos para testar <<<<<<<<<<<\n");
    System.out.println("Por favor escolha uma das opcoes: ");
    System.out.println("1 -> caso100.txt");
    System.out.println("2 -> caso200.txt");
    System.out.println("3 -> caso500.txt");
    System.out.println("4 -> caso1000.txt");
    System.out.println("5 -> caso2000.txt");
    System.out.println("6 -> caso5000.txt");
    System.out.println("7 -> caso10000.txt");
    boolean active2 = true;
    do {
        if (entrada.hasNextInt()) {
            menu = entrada.nextInt();
            active2 = false;
        } else {
            entrada.nextLine();
            System.out.println("\nDigite SOMENTE números\n");
        }
    } while (active2 == true);
    switch (menu) {
        case 1:
            arq="caso100.txt";
            break;
        case 2:
            arq="caso200.txt";
            break;
        case 3:
             arq="caso500.txt";
            break;
        case 4:
             arq="caso1000.txt";
             break;
        case 5:
            arq="caso2000.txt";
             break;
        case 6:
             arq="caso5000.txt";
             break;
        case 7:
             arq="caso10000.txt";
             break;
        default:
          System.out.println("Numero invalido, opcao automaticamente selecionada para caso100.txt");
            arq = "caso100.txt";
            break;

    }
    
    return arq;
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int rotina=0;
    String str = escolheTxt();
    LerArquivoTeste l = new LerArquivoTeste("casos/"+str);
    boolean active2 = true;
    
    System.out.println("Por favor escolha qual rotina de escolha usar:\n1 -> Minimo\n2 -> Maximo");
    do {
        if (scan.hasNextInt()) {
            rotina = scan.nextInt();
            active2 = false;  
        } else {
            scan.nextLine();
            System.out.println("\nDigite SOMENTE Numeros\n");}
        if(rotina!=1&&rotina!=2){
          System.out.println("\nDigite SOMENTE 1 ou 2\n");
          active2=true;}
    } while (active2 == true);
    Comparator<Node> c;
    if(rotina==1){
      c = new NodeComparatorMinimo();}
    else{
      c = new NodeComparatorMaximo();
    }
    try {
      Table t = new Table(l.tamanhoArquivo(), c);
      String[] arquivo =l.criarVetor();
      t.criaTabela(arquivo);
      Procs p = new Procs(arquivo[0].split("Proc")[1], t, c);
      p.setProcs();
      System.out.println("Tempo do programa: " + p.getTempoTotal());
      t.print();
    } catch (IOException e1) {
      e1.printStackTrace();
    }
    scan.close();
     }
}