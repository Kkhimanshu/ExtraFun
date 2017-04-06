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
public class Stack {
    int size;
    int stackArray[];
    int top;
    
    public Stack() {
        this.size = 20;
        stackArray = new int[20];
        this.top = -1;
    } 
    public Stack(int size) {
        this.size = size;
        stackArray = new int[this.size];
        this.top = -1;
    }
    boolean isFull(){
        return (top==stackArray.length-1);
    }
    boolean isEmpty(){
        return (top==-1);
    }
    public boolean push(int data){
        if(!isFull()){
            top++;
            stackArray[top] = data;
            return true;
        }
        else{
            return false;
        }
    }
    public String pop(){
         if(!isEmpty()){ 
             String i = stackArray[top--] + "";   
             return i; 
         }
         else 
             return "stack is empty";
    }
    public boolean contains(int element){
        boolean check=false;
        if(!isEmpty()){ 
            for (int i = 0; i < stackArray.length; i++) {
                if(stackArray[i]==element){
                   check = true;
                   break;
                }    
            }
        }
        return check;
    }
    //2 3 5 6 
    public void reverse(){
      int k=0,temp=0; 
        for (int i = top; i >= ((top+1)/2); i--) {
             temp = stackArray[k];
             stackArray[k] = stackArray[i];
             stackArray[i] = temp;
           k++;
        }
    }
    
    public String toString(){
       String str = ""; 
       for(int element =0;element<=top;element++){
           str+=stackArray[element] + " ";
       }
       return str.trim();
    }
}
