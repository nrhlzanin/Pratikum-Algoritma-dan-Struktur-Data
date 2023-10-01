/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author USER
 */
public class NodeStack {
    String data;
    NodeStack next;
    
    
    public NodeStack(String nilai, NodeStack berikutnya){
        this.data  = nilai;
        this.next = berikutnya;
    }
}
