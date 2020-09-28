
public class Node {
    private String key;
    private int value;
    private Node parent;
    private String nome;

    Node(String key, Node parent) {
        this.setKey(key);
        this.setParent(parent);
        this.setValue(Integer.parseInt(key.split("_")[1]));
        this.setNome(key.split("_")[0]);
    }

    
    // Mostra se o nodo esta livre para ser usado
    public boolean isFree(){
        if(this.getParent()==null){
            return true;
        }
        else
        return false;
    }
    
    //Getters and Setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getKey() {return key;}
    public void setKey(String key) {this.key = key;}
    public Node getParent() {return parent;}
    public void setParent(Node parent) {this.parent = parent;}
    public int getValue() {return value;}
    public void setValue(int value) {this.value= value;}

    public void diminuiValor(int value){
        this.value-=value;
    }
}