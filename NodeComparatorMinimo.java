import java.util.Comparator;

class NodeComparatorMinimo implements Comparator<Node> {

    @Override
    public int compare(Node o1, Node o2) {
            if(o1.getValue()<o2.getValue()){
                return -1;
            }
            else if (o1.getValue()>o2.getValue()){
                return 1;
            }
            //criar politica de empate (ordem alfabetica)
              return o1.getNome().compareTo(o2.getNome());
                
    }
}