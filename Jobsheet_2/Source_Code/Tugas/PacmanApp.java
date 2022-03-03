package Jobsheet_2.Source_Code.Tugas;

public class PacmanApp {
    public static void main(String[] args) {
        Pacman p1= new Pacman();
        p1.x=5;
        p1.y=3;
        p1.height=10;
        p1.width=10;
        System.out.println("Titik koordinat sebelum bergerak");
        System.out.println("Height = "+p1.height);
        System.out.println("Width = "+p1.width);
        p1.printPosition();
        p1.moveLeft();
        p1.printPosition();
        p1.moveRight();
        p1.printPosition();
        p1.moveUp();
        p1.printPosition();
        p1.moveDown();
        p1.printPosition();
    }
}