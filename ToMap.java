import java.util.TreeMap;
import java.util.List;

public class ToMap {
    
    private TreeMap<String,String> treeMap = new TreeMap<>();

    public TreeMap<String,String> toMap(List<String[]> list, String language){
        if(language.equals("english")){
            while(list!=null){
                for(String[] i : list){
                    treeMap.put(i[0],i[1]);
                }
            }
            return treeMap;

        }
        else if(language.equals("spanish")){
            while(list!=null){
                for(String[] i : list){
                    treeMap.put(i[1],i[0]);
                }
            }
            return treeMap;

        }
        else if(language.equals("french")){
            while(list!=null){
                for(String[] i : list){
                    treeMap.put(i[2],i[0]);
                }
            }
            return treeMap;

        }
        else{
            return null;
        }
    }
}   
