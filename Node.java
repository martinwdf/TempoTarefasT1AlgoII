
public class Node implements Comparable<Node>{
    private String key;
    private int value;
    private Node parent;

    Node(String key, Node parent) {
        this.setKey(key);
        this.setParent(parent);
        this.setValue(Integer.parseInt(key.split("_")[1]));
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Node o) {
        //mudar esse if, questao quando tem varios null
        if(o.getParent()==null && this.getParent()!=null){
            return 1;
        }
        if(this.getValue()<o.getValue()){
            return -1;
        }
        else if (this.getValue()>o.getValue()){
            return 1;
        }
        else{
            //fazer comparacao de ordem alfabetica quando ocorrer empate
        }
        return 0;
    }
}