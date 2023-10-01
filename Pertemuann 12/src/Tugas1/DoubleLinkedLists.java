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
public class DoubleLinkedLists {
    Node head;
    int size;

    public DoubleLinkedLists(){
        head = null;
        size = 1;    
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addLast(int no, String nama){
        if (isEmpty()){
            head  = new Node(null, no, nama, null);
        }else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, no, nama,null);
            current.next = newNode;
            size++;
        }
    }
    
    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List Masih kosong, tidak ada data yang dapat dihapus!");
        }else if (size == 1){
            removeLast();
        }else{
            System.out.println(head.nama + " telah selesai diivaksin");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked list masih kosong, tidak ada data yang dapat dihapus!");
        }else if (head.next == null){
            System.out.println(head.nama + " telah selesai diivaksin");
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    
    public void print(){
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(" DAFTAR PENGANTRI VAKSIN ");
        System.out.println("+++++++++++++++++++++++++"); 
        System.out.println("| No\t| Nama" + "\t|");
        if(!isEmpty()){
            Node tmp = head;
            while (tmp != null){
                System.out.print("| " + tmp.no + "\t| "+tmp.nama + " " + "\t|\n");
                tmp = tmp.next;
            }
            System.out.println("\nSisa Antrian " + size);
        }else{
            System.out.println("Linked List Kosong");
        }
    }
}
