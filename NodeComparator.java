import java.util.Comparator;

class NodeComparator implements Comparator<Node> {

    @Override
    public int compare(Node o1, Node o2) {
        if(o2.getParent()==null){
            return 1;
        }
        if(o1.getValue()<o2.getValue()){
            return -1;
        }
        else if (o1.getValue()>o2.getValue()){
            return 1;
        }
        else{
            //fazer comparacao de ordem alfabetica quando ocorrer empate
        }
        return 0;
    }
}