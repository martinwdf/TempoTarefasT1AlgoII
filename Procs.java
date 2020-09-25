import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;


public class Procs {
    private int qtdProcs;
    private Table t;
    private int tempoTotal;

    //criar fila de prioridade para calcular o tempo

    Procs(String s, Table t){
        tempoTotal=0;
        this.t=t;
        qtdProcs = Integer.parseInt(s.split(" ")[1]);
    }

    public int getTempoTotal(){return tempoTotal;}
    public void setTempoTotal(int i){tempoTotal+=i;}

    public void setProcs(){
        //pegar o tamanho da queue
        //criar novos nodos cada insercao na priority queue
        //comparar os valores que estao dentro dos nodos
        //tirar o topo da fila e adicionar o valor ao contador total
        //descontar o valor do retirado dos itens que estao presentes na queue
        //remover o item que ja foi contado da hash table
        //ordenar o hash table novamente
        //pegar os com maior prioridade dependendo de quantos procs estao disponiveis
        Queue<Node> q1 = new PriorityBlockingQueue<>(qtdProcs, new NodeComparatorMinimo());
        while(!t.getHashtable().isEmpty()){
            
            Iterator<Node> itHash =t.getHashtable().values().stream().sorted(new NodeComparatorMaximo()).iterator();
            System.out.println("TABELA HASH");
            t.print();
            while(itHash.hasNext() && q1.size()<qtdProcs){
                Node n= itHash.next();
                //adicionar condicao para nao remover o node no meio do processo
                if(n.isFree() && !q1.contains(n)){
                    q1.add(n);
                }
            }
            //pegar o top sem remover
            // setar o value de todos na fila 
            //remover ele do hash map
            //setar ele para null
            Iterator<Node> itQueue = q1.iterator();
            Node head = q1.peek();
            int value = head.getValue();
            tempoTotal+=value;
            while(itQueue.hasNext()){
                Node n= itQueue.next();
                n.diminuiValor(value);
            }
            t.setParentsNull(head.getKey());
            t.getHashtable().remove(head.getKey());
            q1.poll();
            head=null;

        }
    }
}
