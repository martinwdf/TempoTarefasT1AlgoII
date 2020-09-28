import java.util.Comparator;

class NodeComparatorMaximo implements Comparator<Node> {

    @Override
    public int compare(Node o1, Node o2) {
            if(o1.getValue()<o2.getValue()){
                return 1;
            }
            else if (o1.getValue()>o2.getValue()){
                return -1;
            }
            //politica de empate (ordem alfabetica)
            return o2.getNome().compareTo(o1.getNome());
    }
}