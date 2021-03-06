import java.util.*;

public class Table {

    private int tamanhoArquivo;
    private Hashtable<String, Node> hm;

    Table(int tamanhoArquivo) {
        this.tamanhoArquivo=tamanhoArquivo;
        hm = new Hashtable<String, Node>();
    }

    public void getTamanhoArquivo() {hm.get("wh_360").setParent(null);}
  // public void setTamanhoArquivo(int tamanhoArquivo) {this.tamanhoArquivo = tamanhoArquivo;}

    public Hashtable<String, Node> getHashtable() {return hm;}
    public void criaTabela(String[] s){
        int i=1;
        while(i<tamanhoArquivo-1){

            String[] str = s[i].replaceAll(" ", "").split("->");
            if(!hm.containsKey(str[0])){
                Node n = new Node(str[0], null);
                hm.put(n.getKey(), n);
            }
            if(hm.containsKey(str[1])){
                hm.get(str[1]).setParent(hm.get(str[0]));
            }
            else if(!hm.containsKey(str[1])){
                Node n1 = new Node(str[1], hm.get(str[0]));
                hm.put(n1.getKey(), n1);
            }
            i++;
        }
    }
    public void print(){
        hm.values().stream().sorted(new NodeComparator()).forEachOrdered(
            item -> {if(item.getParent()!=null){
                System.out.println(item.getKey()+" Parent:" + item.getParent().getKey());
            }
            else{

                System.out.println(item.getKey()+" Parent: Null");
            }
            
        });
    }
    public Node[] getDisponiveis(int qtdProcs){
        Node[] n = new Node[qtdProcs];
        Iterator<Node> it =hm.values().stream().sorted(new NodeComparator()).iterator();
        int i=0;
        while(it.hasNext()){
            Node nodo = it.next();
            if(nodo.isFree()){
                n[i]= nodo;
            }
            if(i>4){
                break;
            }
        }
        return n;
    }
}