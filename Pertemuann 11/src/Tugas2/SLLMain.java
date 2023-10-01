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
public class SLLMain {
        public static void main(String[] args){
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.print();
        singLL.addFirst('b');
        singLL.print();
        singLL.addLast('c');
        singLL.print();
        singLL.addFirst('a');
        singLL.print();
        singLL.insertAfter('c', 'd');
        singLL.print();
        singLL.insertAt(4, 'e');
        singLL.print();
    }
}
