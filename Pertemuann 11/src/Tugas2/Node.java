/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author USER
 */
public class Node {
    char data;
    Node next;
    
    public Node(char nilai, Node berikutnya){
        this.data  = nilai;
        this.next = berikutnya;
    }
}
