import java.util.Comparator;

class NodeComparator implements Comparator<Node> {

    @Override
    public int compare(Node o1, Node o2) {
        //parent do segundo livre e o primeiro nao
        // if(o2.isFree() && !o1.isFree()){
        //     return 1;
        // }
        // //parent do primeiro livre e o segundo nao
        // else if(!o2.isFree() && o1.isFree()){
        //     return -1;
        // }
        //os dois livres ou os dois dependentes
        // if((o2.isFree() && o1.isFree()) || (!o2.isFree() && !o1.isFree())){
            if(o1.getValue()<o2.getValue()){
                return -1;
            }
            else if (o1.getValue()>o2.getValue()){
                return 1;
            }
            return 0;
    }
}