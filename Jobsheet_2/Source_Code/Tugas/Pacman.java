package Jobsheet_2.Source_Code.Tugas;

public class Pacman {
    int x,y,width,height;

    void moveLeft(){
        if(x<0 && x>width){
            System.out.print("Error");
        }else {
            System.out.println("Bergerak ke kiri");
            x=x-1;
        }
    }
    void moveRight(){
        if(x<0 && x>width){
            System.out.print("Error");
        }else {
            System.out.println("Bergerak ke kanan");
            x=x+1;
        }
    }
    void moveUp(){
        if(y<0 && y>height){
            System.out.print("Error");
        }else {
            System.out.println("Bergerak ke ke atas");
            y=y+1;
        }
    }
    void moveDown(){
        if(y<0 && y>height){
            System.out.print("Error");
        }else {
            System.out.println("Bergerak ke ke bawah");
            y=y-1;
        }
    }
    void printPosition(){
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
    }
}
