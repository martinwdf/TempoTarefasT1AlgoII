import java.util.*;  
public class Table {

    private Hashtable<String,Node> hm;  
    Table(){
        hm=new Hashtable<String,Node>();
    }
    public Hashtable<String,Node> getHashtable(){return hm;}
    public void criaTabela(String[] s){
        int i=0;
        while(i<6){

            String[] str = s[i].split("->");
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
        hm.values().stream().forEachOrdered(
            item -> {if(item.getParent()!=null){
                System.out.println(item.getKey()+" Parent:" + item.getParent().getKey());
            }
            else{

                System.out.println(item.getKey()+" Parent: Null");
            }
            
        });
    }
}