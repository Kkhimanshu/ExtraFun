package ExtraWork;

import java.util.ArrayList;
import java.util.LinkedList;


/**
 *
 * @author saiteja21
 */
public class LRUCache {
    
    public ArrayList<Integer> lruFunction(int max_cache_size,int frames[],int frame_size){
         ArrayList<Integer> result = new ArrayList<>();
         LinkedList<Integer> current_cache = new LinkedList<>();
         int i,temp,index;
         if(frame_size>0){
             for(i=0;i<max_cache_size;i++){
                current_cache.add(frames[i]);
             }
         }else{
             return null;
         }
         
         for(; i < frames.length; i++) {
            if(current_cache.contains(frames[i])){
               temp = frames[i];
               index = current_cache.indexOf(temp);
               current_cache.remove(index);
               current_cache.addLast(temp);
            }else{
                temp = frames[i];
                result.add(current_cache.getFirst());
                current_cache.removeFirst();
                current_cache.addLast(temp);
            } 
         }
         return result;
     }    
}
