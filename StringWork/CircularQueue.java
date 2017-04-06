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
public class CircularQueue {
    int size,front,rear,queueArray[],total;

    public CircularQueue(int size) {
        this.size = size;
        total=0;
        rear=0;
        front=0;
        queueArray = new int[this.size];
    }
    public CircularQueue() {
        this.size = 20;
        total=0;
        rear=0;
        front=0;
        queueArray = new int[this.size];
    }
    public boolean enQueue(int data){
         if(!isFull()){
             total++;
             queueArray[rear]=data;
             rear=(rear+1)%size;
             return true;
         }else
             return false;
    }
    public String deQueue(){
          String str = "";
          if(!isEmpty()){
             total--;
             str += queueArray[front];
             front=(front+1)%size;
             return str;
         }else
             return "queue is empty";
    }
    boolean isEmpty(){
       return (rear==front);
    }
    boolean isFull(){
       return (total==size);
    }   
}
