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
public class SLLStack {
    NodeStack top;

    boolean isEmpty() {
        return top == null;
    }

    public void push(String data) {
        NodeStack temp = new NodeStack(data, null);

        temp.next = top;
        top = temp;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Data teratas adalah " + top.data);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack masih kosong");
        } else {
            System.out.println("Data yang keluar: " + top.data);
            top = (top).next;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack masih kosong");
        } else {
            NodeStack temp = top;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
