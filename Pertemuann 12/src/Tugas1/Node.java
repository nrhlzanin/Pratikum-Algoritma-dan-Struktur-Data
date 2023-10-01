/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author USER
 */
public class Node {
    int no;
    String nama;

    Node prev, next;

    Node(Node prev, int no, String nama, Node next){
        this.prev = prev;
        this.no = no;
        this.nama = nama;
        this.next = next;
    }
}
