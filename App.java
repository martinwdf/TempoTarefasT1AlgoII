import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {
  public static void main(String[] args) {
        Table t = new Table();
        String[] s=new String[10];
        s[0]="lsq_263->yuqfx_370";
        s[1]="llkgx_112->lsq_263";
        s[2]="llkgx_112->ubf_402";
        s[3]="gh_225->llkgx_112";
        s[4]="gh_225->stxd_282";
        s[5]="gh_225->rhkhp_104";
        Queue<Node> p = new PriorityQueue<>(new NodeComparator());
        t.criaTabela(s);
        //p.addAll(t.getHashtable().values());
        Iterator<Node> it =t.getHashtable().values().iterator();
        while(it.hasNext()){
            p.add(it.next());

        }
        p.add(new Node("test_108", null));
        t.print();
  
        while (!p.isEmpty()) {
          System.out.println(p.poll().getKey());
      }
    }
}