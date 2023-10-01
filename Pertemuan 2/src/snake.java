package jobsheet2;

public class snake {
    int x, y, widht, height;        
    
    void moveLeft(){
        x -=1;
    }
    
    void moveRight(){
        x+=1;
    }
     
    void moveUp (){
        y -=1;
    }
    void moveDown(){
        y +=1;
    }
    
    void printPosition(){
        System.out.println(x + " , " + y);
    }
     
    void detectCollision(int x, int y){
        if(x < 0 || x > widht){
            System.out.println("GAME OVER");
        }else if(y <0 || y > height){
            System.out.println("GAME OVER");
        }else {
        System.out.println("GAME OVER");
        }
    }
}
