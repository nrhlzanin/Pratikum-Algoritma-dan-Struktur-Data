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
public class DoubleLinkedLists {
    Node head;
    int size;

    public DoubleLinkedLists(){
        head = null;
        size = 0;    
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(int id, String judulFilm, double rating){
        if (isEmpty()){
            head  = new Node(null, id, judulFilm, rating, null);
        }else{
            Node newNode = new Node(null, id, judulFilm, rating, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(int id, String judulFilm, double rating){
        if (isEmpty()){
            addFirst(id, judulFilm, rating);
        }else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, id, judulFilm, rating, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void add(int id, String judulFilm, double rating, int index) throws Exception {
        if (isEmpty()){
            addFirst(id, judulFilm, rating);
        }else if (index <0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        }else{
            Node current = head;
            int i = 0;
            while(i<index){
                current = current.next;
                i++;
            }
            if(current.prev == null){
                Node newNode = new Node(null, id, judulFilm, rating, current);
                current.prev = newNode;
                head = newNode;
            }else{
                Node newNode = new Node(current.prev, id, judulFilm, rating, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List Masih kosong, tidak dapat dihapus!");
        }else if (size == 1){
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        }else if (head.next == null){
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
    
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar batas");
        }else if (index == 0){
            removeFirst();
        }else{
            Node current = head;
            int i=0;
            while (i<index){
                current = current.next;
                i++;
            }
            if(current.next == null){
                current.prev.next = null;
            }else if(current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    
    public void print(){
        System.out.println("----------------------");
        System.out.println("Data Saat Ini Menjadi"); 
        if(!isEmpty()){
            Node tmp = head;
            while (tmp != null){
                System.out.println("ID \t\t: " + tmp.id);
                System.out.println("Judul Film \t: " + tmp.judulFilm);
                System.out.println("Rating \t\t: " + tmp.rating);
                System.out.println();
                tmp = tmp.next;
            }
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    
    public int findSeqSearch(int cari){
        Node tmp = head;
        int posisi = -1;
        int index = 0;
        while (tmp != null){
            if(tmp.id == cari){
                posisi = index;
                break;
            }
            index++;
            tmp = tmp.next;
        }
        return posisi;
    }
    
    public void tampilPosisi(int x, int pos){
    if(pos != -1){
        Node tmp = getNodeByIndex(pos);
        System.out.println("Data id film\t\t: " + x + " ditemukan pada node ke " + (pos + 1));
        System.out.println("ID Film\t\t: " + tmp.id);
        System.out.println("Judul Film\t: " + tmp.judulFilm);
        System.out.println("Rating\t\t: " + tmp.rating);
    } else {
        System.out.println("Data id film\t\t" + x + " tidak ditemukan");
    }
}

    private Node getNodeByIndex(int index) {
        if (index >= 0 && index < size) {
            Node current = head;
            int currentIndex = 0;
            while (currentIndex < index) {
                current = current.next;
                currentIndex++;
            }
            return current;
        }
        return null;
    }
    
    public void sort() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        Node current;
        Node index = null;

        do {
            swapped = false;
            current = head;

            while (current.next != index) {
                if (current.rating < current.next.rating) {
                    int tempID = current.id;
                    String tempJD = current.judulFilm;
                    double tempRT = current.rating;

                    current.id = current.next.id;
                    current.judulFilm = current.next.judulFilm;
                    current.rating = current.next.rating;

                    current.next.id = tempID;
                    current.next.judulFilm = tempJD;
                    current.next.rating = tempRT;

                    swapped = true;
                }

                current = current.next;
            }
            index = current;
        } while (swapped);

        print();
    }
}
