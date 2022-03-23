package Jobsheet_4.Source_Code.Percobaan;

import java.util.Scanner;

public class MainPangkatQuestion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PangkatQuestion[]png = new PangkatQuestion[5];
        png[0] = new PangkatQuestion(5, 2);
        png[1] = new PangkatQuestion(10, 2);
        png[2] = new PangkatQuestion(15, 4);
        png[3] = new PangkatQuestion(20, 2);
        png[4] = new PangkatQuestion(25, 2);

        System.out.println("=================================================");
        System.out.println("Hasil Pangkat dengan Bruce Force");
        for(int i=0; i<png.length; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        
        System.out.println("=================================================");
        System.out.println("Hasil Pangkat dengan Divide Conquer");
        for(int i=0; i<png.length; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }

        System.out.println("=================================================");
    }
}