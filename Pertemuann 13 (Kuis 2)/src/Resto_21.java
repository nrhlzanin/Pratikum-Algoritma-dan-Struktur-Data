/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis2;

/**
 *
 * @author USER
 */
public class Resto_21 {
   Node_21 head;
   int size;
   
   public Resto_21(){
       head = null;
       size = 0;
   }
   
   public boolean isEmpty(){
       return head == null;
   }
   
   public void addFrist(Pembeli_21 b, Pesanan_21 c){
       if(isEmpty()){
           head = new Node_21(null, b, c, head);
       }else {
           Node_21 newNode = new Node_21(null, b, c, head);
           head.prev = newNode;
           head = newNode;
       }
       size++;
   }
   
   public void print(){
       if(!isEmpty()){
           Node_21 tmp = head;
           while(tmp != null){
               tmp = tmp.next;
           }
           System.out.println("Antrian berhasil ditambahkan");
       }else{
           System.out.println("Antrian masih kosong");
       }
   }
   
   public void removeFirst() throws Exception{
       if(isEmpty()){
           throw new Exception("Antrian masih kosong, tidak bisa menghapus antrian");
       }else if(size == 1){
           head = null;
           System.out.println(head.pembeli.nama +  "Telah memesan menu");
       }else{
           head = head.next;
           head.prev = null;
           size--;
       }
   }
   
   public int totalPemasukan(){
       int total = 0;
       Node_21 current = head;
       while (current != null){
           total += current.pesanan.harga;
           current = current.next;
       }
       return total;
   }

    void addFirst(Pembeli_21 pembeli, Pesanan_21 pesanan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
}
