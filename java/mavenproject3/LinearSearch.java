public class LinearSearch extends Search{
    LinearSearch(String name){
        super(name);
    }
    
    boolean doSearch(String s, String [] data){
        for (int i=0;i<data.length;i++){
            if (data[i].equals(s)){
                return true;
            }
        }
        return false;
    }
    
    boolean doSearch(int x, int[] data){
        for (int i=0;i<data.length;i++){
            if (data[i]==x){
                return true;
            }
        }
        return false;
    }
    
}