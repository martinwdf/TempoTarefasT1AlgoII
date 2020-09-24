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

    public void sortQueue(){
        //chamar metodo que organiza os itens
    }
    public void setProcs(){
        //pegar o tamanho do arreio de nodes
        Node[] nodes = t.getDisponiveis(qtdProcs);
        int[] numeros;
        for(int i=0;i<t.getDisponiveis(qtdProcs).length;i++){
            
            
        }

    }
}
