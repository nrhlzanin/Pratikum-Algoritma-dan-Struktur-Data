/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum2;

/**
 *
 * @author USER
 */
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int [] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.traverseInOrder(0);
        System.out.println("");
        
        //Soal 5
        System.out.println("-------------------------------");
        System.out.println("           Tugas NO 5          ");
        System.out.println("-------------------------------");
        bta.add(90);
        bta.add(72);
        System.out.println("method traverse PreOrder");
        bta.traversePreOrder(0);
        System.out.println();
        System.out.println("method traverse PostOrder");
        bta.traversePostOrder(0);
        System.out.println();
    }
}
