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
            //criar politica de empate (ordem alfabetica
            return 0;
    }
}