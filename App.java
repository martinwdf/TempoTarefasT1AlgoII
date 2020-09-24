import java.io.IOException;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {
  public static void main(String[] args) {
    LerArquivoTeste l = new LerArquivoTeste("p1.txt");
    Queue<Node> pq = new PriorityQueue<>();
    try {
      Table t = new Table(l.tamanhoArquivo());
      t.criaTabela(l.criarVetor());
      //pq.addAll(t.getHashtable().values());
      t.getTamanhoArquivo();
      //pq.add(new Node("rhkhp_104",null));
      //pq.add(new Node("rhkhp_99",null));
      //pq.clear();
      //pq=pq1;
      Iterator<Node> it = pq.iterator();
      while(it.hasNext()){
        System.out.println(it.next().getKey());
      }
      //t.print();
    } catch (IOException e1) {
      e1.printStackTrace();
    }
    }
}