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
public class SLLStackMain {
    public static void main(String[] args) {
        SLLStack stack = new SLLStack();

        stack.push("Bahasa");
        stack.push("Android");
        stack.push("Komputer");
        stack.push("Basis Data");
        stack.push("Matematika");
        stack.push("Algoritma");
        stack.push("Statistika");
        stack.push("Multimedia");

        stack.print();
        System.out.println();
        stack.pop();
        stack.print();
        stack.peek();
        System.out.println();
        stack.pop();
        stack.print();
    }
}
