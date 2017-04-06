/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraWork;

import java.util.HashMap;
/**
 *
 * @author saiteja21
 */
public class LinkedinProblem {
    HashMap<Integer, Character> map = new HashMap<>();
    String ch;
    int i;
    public LinkedinProblem(){
        for(i=33; i<=126; i++)
        {
            ch = new Character((char)i).toString().trim();
            map.put(i, ch.charAt(0));
        }
    }
/**
* This function simply takes a string(the binary values) as a parameter 
* and returns the equivalent text or information 
     * @param binaryValuesString
     * @return 
*/
    public String evaluateBinaryToString(String binaryValuesString){
         String result=" ",binaryStringArray[] = binaryValuesString.split(" ");
         for (String string : binaryStringArray) {
             if(map.containsKey(Integer.parseInt(string.trim(), 2))){
                 result += map.get(Integer.parseInt(string.trim(), 2));
             }else{
                result += " ";        
             }
         }
         return result;
    }
/**
* This function simply takes a string as a parameter 
* and returns the equivalent binary string 
     * @param string 
     * @return 
*/
    public String evaluateStringToBinaryString(String string){
       String result=" "; 
       char stringArray[]=string.toCharArray();
       for (char c : stringArray) {
           result = result + Integer.toBinaryString((int)c) + " ";
       }
       return result.trim();
   }
}
