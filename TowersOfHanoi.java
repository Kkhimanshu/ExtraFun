/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraWork;

/**
 *
 * @author saiteja21
 */
public class TowersOfHanoi {

    // print out instructions for moving n discs to
    // the left (if left is true) or right (if left is false)
    public static void moves(int n, boolean left) {
        if (n == 0) 
            return;
        moves(n-1, !left);
        if(left) 
            System.out.println(n + " left");
        else      
            System.out.println(n + " right");
        moves(n-1, !left);
    }
//
//    public static void main(String[] args) {
//        int n = Integer.parseInt(args[0]);
//        moves(n, true);
//    }

}