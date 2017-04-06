/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraWork.StringWork;

/**
 *
 * @author saiteja21
 */
public class LongestCommonSubString {
    String string1,string2;

    public LongestCommonSubString(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }
/**
 *   @param  two strings string1 and string2 
 *   @return longest common substring from string1 to string2 returns null when no match
 *   implemented in dynamic programming  
      A B C D
 *  B 0 1 0 0
 *  C 0 0 2 0
 *  D 0 0 0 3
 */  
    public String longestCommonSubString(){
        String currentMatched = "";
        if(this.string1.length()==0 || this.string2.length()==0) return currentMatched;
        
        int len = 0;
        int matchArray[][] = new int[this.string1.length()][this.string2.length()];
        
            for (int i = 0; i < this.string1.length(); i++) {
                for (int j = 0; j < this.string2.length(); j++) {
                    if(this.string1.charAt(i) == this.string2.charAt(j)){
                        if(i==0 || j==0){
                           matchArray[i][j] = 1; 
                        }else{
                           matchArray[i][j] = matchArray[i-1][j-1]+1; 
                        }
                        if (matchArray[i][j]>len) {
                            len = matchArray[i][j];
                            currentMatched = this.string1.substring(i-len+1,i+1);
                        }
                    }
                }
            }
        
      return currentMatched;
    }
}
