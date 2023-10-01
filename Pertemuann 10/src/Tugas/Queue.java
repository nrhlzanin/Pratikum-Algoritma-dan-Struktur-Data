/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author USER
 */
public class Queue {
    Pembeli[] antrian;
    int front;
    int rear;
    int size;
    int max;

    
    public Queue(int n){
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean IsEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    
    public void Enqueue(Pembeli antri){
        if (IsFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = antri;
            size++;
        }
    }

    public Pembeli Dequeue(){
        Pembeli data = null;
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            data = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
            
        }
        return data;
    }
    
    public void print(){
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " - " + antrian[i].noHp);
                i = (i + 1) % max; 
            }
            System.out.println(antrian[i].nama + " - " + antrian[i].noHp);
            System.out.println("Jumlah elemen = " + size);
        }
    }
    
    public void peek(){
        if (!IsEmpty()) {
            System.out.println("Pembeli paling depan: " + antrian[front].nama + " - " + antrian[front].noHp);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    
    public void peekRear(){
        if (!IsEmpty()) {
            System.out.println("Pembeli paling belakang: " + antrian[rear].nama + " - " + antrian[rear].noHp);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    
    public void peekPosition(String nama) {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            int i = front;
            int posisi = -1;
            while (i != rear) {
                if (antrian[i].nama.equalsIgnoreCase(nama)) {
                    posisi = i;
                    break;
                }
                i = (i+1) % max;
            }
            if (antrian[rear].nama.equalsIgnoreCase(nama)) {
                posisi = rear;
            }
            if (posisi == -1) {
                System.out.println("Pembeli dengan nama " + nama + " tidak ditemukan");
                return;
            }
            System.out.println("Pembeli " + nama + " berada pada posisi " + (posisi + 1) + " dalam antrian");
        }
    }
    
    public void clear(){
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}
