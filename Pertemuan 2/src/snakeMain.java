package jobsheet2;
import java.util.Scanner;
public class snakeMain {
   public static void main(String[] args){
       Scanner input = new Scanner (System.in);
       snake snake1 = new snake();
       
       System.out.print("Masukkan koordinat x = ");
       snake1.x = input.nextInt();
       System.out.print("Masukkan koordinat y = ");
       snake1.y = input.nextInt();
       System.out.print("Masukkan Lebar Area Permainan = ");
       snake1.widht = input.nextInt();
       System.out.print("Masukkan Panjang Area Permainan = ");
       snake1.height = input.nextInt();
       
       snake1.moveLeft();
       snake1.moveRight();
       snake1.moveUp();
       snake1.moveDown();
       snake1.printPosition();
       snake1.detectCollision(snake1.x, snake1.y);
       
   } 
}
