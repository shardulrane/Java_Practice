/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shardul_practice;

/**
 *
 * @author DELL
 */
class Node {

    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int val) {
        if (val <= data) {
            if (left == null) {
                left = new Node(val);
            } else {
                left.insert(val);
            }
        } else {
            if (right == null) {
                right = new Node(val);
            } else {
                right.insert(val);
            }

        }
    }

    public boolean find(int val) {
        if (val == data) {
            return true;
        }
        if (val <= data) {
            if (left == null) {
                return false;
            } else {
                return left.find(val);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.find(val);
            }

        }
    }
}

public class Shardul_Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome Back To Java");
    }

}
