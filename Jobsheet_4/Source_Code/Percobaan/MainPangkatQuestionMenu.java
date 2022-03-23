package Jobsheet_4.Source_Code.Percobaan;

import java.util.Scanner;

public class MainPangkatQuestionMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PangkatQuestionMenu[]png = new PangkatQuestionMenu[5];
        png[0] = new PangkatQuestionMenu(5, 2);
        png[1] = new PangkatQuestionMenu(10, 2);
        png[2] = new PangkatQuestionMenu(15, 4);
        png[3] = new PangkatQuestionMenu(20, 2);
        png[4] = new PangkatQuestionMenu(25, 2);
        
        System.out.println("===========================================");
        System.out.println("                Menu Pangkat               ");
        System.out.println("===========================================");
        System.out.println("1. Menggunakan Brute Force ");
        System.out.println("2. Menggunakan Devide Conquer ");
        System.out.println("3. Exit ");
        System.out.print("Silahkan Pilih Metode Perhitungan : ");
        int pilih = sc.nextInt();
        
        switch(pilih){
            case 1 :
                System.out.println("============================================");
                System.out.println("Hasil pangkat dengan Brute force ");     
                for(int i=0; i<png.length; i++){
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
                }
            break;
            case 2 :
                System.out.println("============================================");
                System.out.println("Hasil pangkat dengan Devide Conquer ");
                for(int i=0; i<png.length; i++){
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
                }
            break;
            case 3 :
                System.out.println("------------Terima Kasih---------");
            break;
            default :
                System.out.println("------ input yang anda masukkan salah -------");
        }
    }
}
