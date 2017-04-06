package ExtraWork;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author saiteja21
 */
public class CharacterFrequency {
   public Map getFrequencyCountOfCharacter(String str){
       if(str.isEmpty()){
           throw new RuntimeException("No string Found!");
       }
       HashMap<Character,Integer> map = new HashMap<>();
       for (int i = 0; i < str.length(); i++) {
           char c = str.charAt(i);
           Integer value = map.get(new Character(c));
           if(value!=null){
               map.put(c, new Integer(value+1));
           }else{
               map.put(c,1);
           }
       }
       return map;
   }
}
